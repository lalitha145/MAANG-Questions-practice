class Solution {

    public boolean winnerSquareGame(int n) {

        Boolean[][] dp = new Boolean[n + 1][2];

        return helper(n, 1, dp);
    }

    boolean helper(int n, int turn, Boolean[][] dp) {

        if (n == 0) {
            return turn == 1 ? false : true;
        }

        if (dp[n][turn] != null) {
            return dp[n][turn];
        }

        for (int i = 1; i * i <= n; i++) {

            if (turn == 1) { // Alice's turn

                if (helper(n - i * i, 0, dp)) {
                    return dp[n][turn] = true;
                }

            } else { // Bob's turn

                if (!helper(n - i * i, 1, dp)) {
                    return dp[n][turn] = false;
                }

            }
        }

        return dp[n][turn] = (turn == 1 ? false : true);
    }
}