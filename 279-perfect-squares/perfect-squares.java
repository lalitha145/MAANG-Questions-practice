class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        
        return helper(n,dp);
    }
    int helper(int n,int dp[]){
        if(n==0) return 0;
        if(n<0) return (int)1e9;
        if(dp[n]!=-1) return dp[n];
        int ans=(int)1e9;
        for(int i=1;i*i<=n;i++){
            ans=Math.min(ans,1+helper(n-i*i,dp));

        }
        return dp[n]=ans;
    }
}