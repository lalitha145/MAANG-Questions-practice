class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        if(grid[m-1][n-1]==1) return 0;
        return helper(grid,grid.length-1, grid[0].length-1,dp);
    }
    int helper(int grid[][],int i,int j,int dp[][]){
        if(i==0 && j==0){
           if(grid[i][j]==1) return 0;
           else return 1;
        }
        
        if(i<0 || j<0 || grid[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        
        int left=helper(grid,i,j-1,dp);
        int up=helper(grid,i-1,j,dp);
        return dp[i][j]=up+left;

    }
}