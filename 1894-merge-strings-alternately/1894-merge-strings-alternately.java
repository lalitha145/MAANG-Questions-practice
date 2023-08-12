class Solution {
    public String mergeAlternately(String word1, String word2) {
       int i=0;
       int j=0;
       String t="";
       while(i<word1.length() || j<word2.length()){
           if(i<word1.length()){
               t+=word1.charAt(i);
               i++;
           }
           if(j<word2.length()){
               t+=word2.charAt(j);
               j++;
           }
       }
       return t;
    }
}