class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,(int)1e9);
        
    //     return helper(n,dp);
    // }
    // int helper(int n,int dp[]){
    //     if(n==0) return 0;
    //     if(n<0) return (int)1e9;
    //     if(dp[n]!=-1) return dp[n];
    //     int ans=(int)1e9;
    //     for(int i=1;i*i<=n;i++){
    //         ans=Math.min(ans,1+helper(n-i*i,dp));

    //     }
    //     return dp[n]=ans;
    // }
    dp[1]=1;
    dp[0]=0;
    // dp[2]=2;
    // dp[3]=3;
    for(int sum=2;sum<=n;sum++){
        for(int i=1;i*i<=sum;i++){
            dp[sum]=Math.min(dp[sum],1+dp[sum-i*i]);
        }
    }
    return dp[n];
    }
}