class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length-1;
        int n=grid[0].length-1;
        int dp[][]=new int[m+1][n+1];
        dp[0][0]=grid[0][0];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0) continue;
                int left=Integer.MAX_VALUE;
                if(j>0){
                    left=dp[i][j-1];
                }
                int up=Integer.MAX_VALUE;
                if(i>0){
                    up=dp[i-1][j];
                }
                dp[i][j]=grid[i][j]+Math.min(left,up);
            }

        }
        return dp[m][n];
    }
}