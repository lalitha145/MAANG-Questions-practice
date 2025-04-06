class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(0, 0, prices, dp);
    }

    // buy = 0 means we can buy, buy = 1 means we have stock and we can sell
    private int helper(int i, int buy, int[] prices, int[][] dp) {
        if (i >= prices.length) return 0;

        if (dp[i][buy] != -1) return dp[i][buy];

        int profit = 0;
        if (buy == 0) {
            // Option 1: Buy stock
            int buyNow = -prices[i] + helper(i + 1, 1, prices, dp);
            // Option 2: Skip
            int skip = helper(i + 1, 0, prices, dp);
           return dp[i][buy]=profit = Math.max(buyNow, skip);
        } else {
            // Option 1: Sell stock
            int sellNow = prices[i] + helper(i + 2, 0, prices, dp);
            // Option 2: Hold
            int hold = helper(i + 1, 1, prices, dp);
            return dp[i][buy]=profit = Math.max(sellNow, hold);
        }

        // return dp[i][buy] = profit;
    }
}
