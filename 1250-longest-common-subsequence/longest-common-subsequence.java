class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int a[]:dp) Arrays.fill(a,-1);
        return helper(text1,text2,text1.length()-1, text2.length()-1,dp);
    }
    int helper(String text1, String text2, int i, int j,int dp[][]){
        if(i<0 || j<0) return 0;
       if(text1.charAt(i)==text2.charAt(j)) return 1+helper(text1,text2,i-1,j-1,dp);
       if(dp[i][j]!=-1) return dp[i][j];
        int ch1=0;
        int ch2=0;
        ch1=helper(text1,text2,i-1,j,dp);
        ch2=helper(text1,text2,i,j-1,dp);
        return dp[i][j]=Math.max(ch1,ch2);
      
    }
}