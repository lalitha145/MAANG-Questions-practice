class Solution {
    static int mod=(int)Math.pow(10,9)+7;
   
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) 
    {
        int dp[][][]=new int[m][n][maxMove+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(dp,m,n,maxMove,startRow,startColumn);
    }
    static int helper(int dp[][][],int m,int n,int move,int s,int e){
        if(s<0 || e<0 || s==m || e==n){
            return 1;
        }
        if(dp[s][e][move]!=-1){
            return dp[s][e][move];
        }
        int left=0;
        int right=0;
        int top=0;
        int bottom=0;
        if(move>0){
            left=helper(dp,m,n,move-1,s,e-1);
            right=helper(dp,m,n,move-1,s,e+1);
            top=helper(dp,m,n,move-1,s-1,e);
            bottom=helper(dp,m,n,move-1,s+1,e);

        }
        return dp[s][e][move]=((left+right)%mod+(top+bottom)%mod)%mod;
    }
}