class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()][s.length()];
        return helper(s, 0, s.length() - 1,dp);
    }
    int helper(String s, int start, int end,int dp[][])
    {
        if(start > end)
            return 0;

        if(start == end)
            return 1;
        if(dp[start][end]!=0) return dp[start][end];
        if(s.charAt(start) == s.charAt(end))
            return 2 + helper(s, start+1, end-1,dp);
        
        else
             return dp[start][end]=Math.max(helper(s, start+1, end,dp), helper(s, start, end-1,dp));
    }
}