class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        // dp[2]=2;
        for(int i=1;i<=n;i++){
            int ans=(int)1e9;
            for(int j=1;j*j<=i;j++){
                ans=Math.min(ans,1+dp[i-j*j]);
            }
            dp[i]=ans;
           
        }
        return dp[n];
    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return helper(n,dp);
    // }
    // int helper(int n,int dp[]){
    //     if(n==0) return 0;
    //     if(n<0) return (int)1e9;
    //     int ans=(int)1e9;
    //     if(dp[n]!=-1) return dp[n];

    //     for(int i=1;i*i<=n;i++){
    //         ans=Math.min(ans,1+helper(n-i*i,dp));
    //     }
    //     return dp[n]=ans;
    }
}