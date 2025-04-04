class Solution {
    public int minPathSum(int[][] grid) {

        int m=grid.length-1;
        int n=grid[0].length-1;
        int dp[][]=new int[m+1][n+1];
        for(int a[]:dp) Arrays.fill(a,-1);
        return helper(grid,m,n,dp);
    }
    int helper(int grid[][],int m, int n,int dp[][]){
        if(m==0 && n==0) return grid[0][0];
        if(m<0 || n<0) return Integer.MAX_VALUE;
        if(dp[m][n]!=-1) return dp[m][n];
        int left=helper(grid,m,n-1,dp);
        int up=helper(grid,m-1,n,dp);
        int value=grid[m][n]+Math.min(left,up);
        return dp[m][n]=value;
    }
}