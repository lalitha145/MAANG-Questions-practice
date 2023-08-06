class Solution {
    public boolean isAnagram(String s, String t) {
        int fre[]=new int[26];
        
        for(char c:s.toCharArray()){
            fre[c-'a']++;
        }
         for(char c:t.toCharArray()){
            fre[c-'a']--;
        }
        for(int i:fre){
            if(i>=1 || i<0){
                return false;
            }
        }
        return true;

    }
}