class Solution {
    public String longestPalindrome(String s) {
    int max_length=1;
    int start=0;
    boolean dp[][]=new boolean[s.length()][s.length()];
     for (int i = 0; i < s.length(); i++) {
        dp[i][i] = true;
    }
    for(int len=2;len<=s.length();len++){
        for(int i=0;i<s.length()-len+1;i++){
            int j=i+len-1;
            if(s.charAt(i)==s.charAt(j)){
                if(len==2 || dp[i+1][j-1]==true){
                    dp[i][j]=true;
                    if(len>max_length){
                        max_length=len;
                        start=i;
                    }
                }
            }
        }
    }  
    return s.substring(start,start+max_length);  
  }
}