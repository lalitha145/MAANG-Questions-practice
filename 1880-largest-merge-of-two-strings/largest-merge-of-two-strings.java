class Solution {
    public String largestMerge(String word1, String word2) {
       StringBuilder sb=new StringBuilder();
       int i=0, j=0;
       while(i<word1.length() && j<word2.length()){
        if(word1.charAt(i)>word2.charAt(j)){
            sb.append(word1.charAt(i++));
        }else if (word1.charAt(i)<word2.charAt(j)){
            sb.append(word2.charAt(j++));
        }else{
            String temp1=word1.substring(i,word1.length());
            String temp2=word2.substring(j,word2.length());
            if(temp1.compareTo(temp2)<0){
                sb.append(word2.charAt(j++));
            }else{
                sb.append(word1.charAt(i++));
            }
        }
       }
       while(i<word1.length()){
        sb.append(word1.charAt(i++));
       }
       while(j<word2.length()){
        sb.append(word2.charAt(j++));
       }
       return sb.toString();
    }
}