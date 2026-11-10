class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        for(int i=0;i<haystack.length();i++){
            int j=0;
            int t=i;
            while(i<haystack.length() && j<needle.length() && needle.charAt(j)==haystack.charAt(i)){
                j++;
                i++;
            }
            if(j==needle.length()) return t;
            i=t;
        }
        return -1;
    }
}