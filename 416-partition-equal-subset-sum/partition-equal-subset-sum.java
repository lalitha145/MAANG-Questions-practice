class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        if(sum%2!=0) return false;
        int target=sum/2;
          int n = nums.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Initialize: sum 0 is always possible (with empty set)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the subset sum table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j]; // pick or not pick
                } else {
                    dp[i][j] = dp[i - 1][j]; // can't pick
                }
            }
        }

        return dp[n][target];
    }
}