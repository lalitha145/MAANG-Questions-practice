class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> map=new HashMap<>();
      for(String s:strs){
          char sorted[]=s.toCharArray();
          Arrays.sort(sorted);
          String sortedString=new String(sorted);
          if(!map.containsKey(sortedString)){
              map.put(sortedString,new ArrayList<>());
          }
          map.get(sortedString).add(s);
      }
      return new ArrayList<>(map.values());
    }
}
