class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String sortedString=new String(ch);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(s);
            }else{
                map.put(sortedString,new ArrayList<>());
                map.get(sortedString).add(s);
            }

        }
      return new ArrayList<>(map.values());
    }
}