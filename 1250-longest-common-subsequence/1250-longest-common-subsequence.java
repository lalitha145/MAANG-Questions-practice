class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return helper(dp,text1,text2,0,0);
    }
    static int helper(int dp[][],String s1,String s2,int i,int j){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int p1=0;

        if(s1.charAt(i)==s2.charAt(j)){
            p1=1+helper(dp,s1,s2,i+1,j+1);
        }
        int np=Math.max(helper(dp,s1,s2,i+1,j),helper(dp,s1,s2,i,j+1));
        return dp[i][j]=Math.max(p1,np);
    }
}