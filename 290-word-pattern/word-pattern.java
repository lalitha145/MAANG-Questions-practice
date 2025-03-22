class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String str[]=s.split(" ");
        int i=0;
        if(pattern.length()!=str.length) return false;
        for(char c:pattern.toCharArray()){
            if(map.containsKey(c)){
                if(map.get(c).equals(str[i])==false) return false;
            }else if(map.containsValue(str[i])){
                return false;
            }else{
                map.put(c,str[i]);
            }
            i++;
        }
        return true;
    }
}