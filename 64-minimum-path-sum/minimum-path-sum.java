class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       int dp[][]=new int[m][n]; 
       for(int d[]:dp) Arrays.fill(d,-1);
       return findMinimumPath(grid,m,n,dp,m-1,n-1);
    }
    int findMinimumPath(int grid[][], int m, int n, int dp[][],int row,int col){
        if(row==0 && col==0) return grid[0][0];
        if(row<0 || col<0) return (int)1e9;
        if(dp[row][col]!=-1) return dp[row][col];
        int ch1=grid[row][col]+findMinimumPath(grid,m,n,dp,row-1,col);
        int ch2=grid[row][col]+findMinimumPath(grid,m,n,dp,row,col-1);
        return dp[row][col]=Math.min(ch1,ch2);

    }
}