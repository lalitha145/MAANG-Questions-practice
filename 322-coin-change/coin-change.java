class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[]=new int[amount+1];
        if(amount==0) return 0;
      //  dp[0]=0;
        Arrays.fill(dp,amount+1);
         dp[0]=0;
      for (int j = 1; j <= amount; ++j) {
        for (int i = 0; i < coins.length; ++i) {
            if (coins[i] <= j) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        }
           return dp[amount] > amount ? -1 : dp[amount];

}


}