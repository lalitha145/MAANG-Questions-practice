class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][]=new int[n+1][target+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return helper(n,k,target,dp);
    }
    int helper(int n, int k, int t, int dp[][]){
        if(n==0 && t==0) return 1;
        if(t<0 || n<0) return 0;
        long ans=0;
        if(dp[n][t]!=-1) return dp[n][t];
        long mod=1000000007;
        for(int i=1;i<=k;i++){
            long way=helper(n-1,k,t-i,dp);
            ans=(ans+way)%mod;
        }
        return dp[n][t]=(int)ans;
    }
}