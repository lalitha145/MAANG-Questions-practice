
public class    Solution {
    static int[] dp; 

    public static int climbStairs(int n, int[] costs) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, costs);
    }

    private static int solve(int j, int[] costs) {
        if (j == 0) return 0; 
        if (dp[j] != -1) return dp[j];

        int ans = Integer.MAX_VALUE;
        for (int step = 1; step <= 3; step++) {
            int i = j - step;
            if (i >= 0) {
                ans = Math.min(ans, solve(i, costs) + costs[j - 1] + step * step);
            }
        }
        return dp[j] = ans;
    }

  
}
