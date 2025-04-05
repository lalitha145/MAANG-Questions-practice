class Solution {
    public int minInsertions(String s) {
      int dp[][]=new int[s.length()][s.length()];
      for(int a[]:dp) Arrays.fill(a,-1);
        return helper(s, 0, s.length() - 1,dp);
    }
    int helper(String s, int start, int end,int dp[][])
    {
        if(start > end)
            return 0;

        if(start == end)
            return 0;
        if(dp[start][end]!=-1) return dp[start][end];
        if(s.charAt(start)==s.charAt(end)) {
            return 0+helper(s,start+1,end-1,dp);
        }
        if(s.charAt(start) != s.charAt(end))
            return dp[start][end]=1 + Math.min(helper(s, start+1, end,dp), helper(s,start,end-1,dp));
        
        else
             return dp[start][end]=Math.min(helper(s, start+1, end,dp), helper(s, start, end-1,dp));
    

    }
}