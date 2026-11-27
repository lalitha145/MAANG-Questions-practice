import java.util.*;

class Solution {

    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return helper(days, costs, 0, dp);
    }

    private int helper(int[] days, int[] costs, int i, int[] dp) {

        if (i >= days.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int next1 = binarySearch(days, days[i]);
        int next7 = binarySearch(days, days[i] + 6);
        int next30 = binarySearch(days, days[i] + 29);

        int oneDay =
                costs[0] + helper(days, costs, next1, dp);

        int sevenDay =
                costs[1] + helper(days, costs, next7, dp);

        int thirtyDay =
                costs[2] + helper(days, costs, next30, dp);

        return dp[i] =
                Math.min(oneDay,
                Math.min(sevenDay, thirtyDay));
    }

    private int binarySearch(int[] days, int coveredTill) {

        int low = 0;
        int high = days.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (days[mid] <= coveredTill) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low; 
    }
}