class Solution {
    public char findTheDifference(String s, String t) {
        char a[]=new char[26];
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        for(char c:t.toCharArray()){
            if(a[c-'a']==0){
                return c;

            }else{
                a[c-'a']--;
            }
        }
        return 'a';

    }
}