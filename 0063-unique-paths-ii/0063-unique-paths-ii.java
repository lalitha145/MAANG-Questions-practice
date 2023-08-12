class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return helper(dp,m-1,n-1,obstacleGrid);
    }
    static int helper(int dp[][],int m,int n,int g[][]){
        if(m==0 && n==0 && g[m][n]==0){
            return 1;
        }
       if(m<0 || n<0 || g[m][n]==1){
           return 0;
       }
       if(dp[m][n]!=-1){
           return dp[m][n];
       }
       int top=helper(dp,m,n-1,g);
       int right=helper(dp,m-1,n,g);
       return dp[m][n]=top+right;
    }
}