class Solution {
    public int longestPalindromicSubsequence(String s, int k) {
        int n=s.length();
        int dp[][][]=new int[n][n][k+1];
        for(int[][]mat:dp){
            for(int []m:mat){
             Arrays.fill(m,-1);
            }
        }

        return solve(0,n-1,k,s,dp);
    }

    public int solve(int i,int j,int k,String s,int[][][] dp){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j][k]!=-1) return dp[i][j][k];
        int ans=0;
        if(s.charAt(i)==s.charAt(j)){
           ans=2+solve(i+1,j-1,k,s,dp);
        }
        else{
            ans=Math.max(solve(i+1,j,k,s,dp),solve(i,j-1,k,s,dp));
            int diff=findDiff(s.charAt(i),s.charAt(j));
            if(k>=diff){
                ans=Math.max(ans,2+solve(i+1,j-1,k-diff,s,dp));
            }
        }

        return dp[i][j][k]=ans;
    }

    public int findDiff(char ch1,char ch2){
        int dist=Math.abs(ch1-ch2);
        return Math.min(dist,26-dist);
    }
}