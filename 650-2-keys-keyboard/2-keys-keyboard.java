import java.util.*;

class Solution {

    public int minSteps(int n) {

        if (n == 1) return 0;

        int[][] dp = new int[n + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(n, 1, 0, dp);
    }

    int helper(int n, int cnt, int copiedAs, int[][] dp) {

        if (cnt == n) return 0;

        if (cnt > n) return (int) 1e9;

        if (dp[cnt][copiedAs] != -1) {
            return dp[cnt][copiedAs];
        }

        int pasteOnly = (int) 1e9;
        int copyAndPaste = (int) 1e9;

        if (copiedAs > 0) {
            pasteOnly =
                1 + helper(n, cnt + copiedAs, copiedAs, dp);
        }

        copyAndPaste =
            2 + helper(n, 2 * cnt, cnt, dp);

        return dp[cnt][copiedAs] =
            Math.min(pasteOnly, copyAndPaste);
    }
}
