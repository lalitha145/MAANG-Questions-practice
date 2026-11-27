class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int ans=(int)1e9;

        int[][] dp = new int[m][n];
        
        for(int col=0;col<m;col++){
            dp[0][col]=matrix[0][col];
        }
        for(int row=1;row<m;row++){
            for(int col=0;col<n;col++){
                int left=(int)1e9;
                int middle=dp[row-1][col];
                int right=(int)1e9;
                if(col>0){
                    left=dp[row-1][col-1];
                }
                if(col<n-1){
                    right=dp[row-1][col+1];
                }
             dp[row][col]=matrix[row][col]+Math.min(left,Math.min(right,middle));
            }
           
        }
        for(int col=0;col<n;col++){
            ans=Math.min(ans,dp[n-1][col]);
        }
        return ans;

    }
}