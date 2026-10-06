class Solution {
    public boolean isAnagram(String s, String t) {
        int fre[]=new int[26];
        for( char ch :s.toCharArray()){
            fre[ch-'a']++;
        }
        for(char ch :t.toCharArray()){
            fre[ch-'a']--;
        }
        for(int i=0;i<26;i++){
            if(fre[i]!=0) return false;
        }
        return true;
    }
}