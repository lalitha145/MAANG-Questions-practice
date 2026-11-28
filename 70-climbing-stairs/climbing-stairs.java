class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int dp[]=new int[n+1];
          dp[1]=1;
          dp[2]=2;
        for(int target=3;target<=n;target++){
            int oneStep=dp[target-1];
            int twoSteps=dp[target-2];
            dp[target]=dp[target-1]+dp[target-2];

        }
        return dp[n];

    }
 
}