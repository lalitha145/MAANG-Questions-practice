class Solution {
    public int numDistinct(String s, String t) {
        int N = s.length();
        int M = t.length();
        int [][] dp =new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                dp[i][j]= -1;
            }
        }//init dp
        return countAllSub(N-1,M-1,s,t ,dp);
    }
    
    int countAllSub(int i, int j ,String s ,String t,int[][]dp){
        if(j<0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){//IF Match
            dp[i][j] =  countAllSub(i-1,j-1,s,t,dp) + countAllSub(i-1, j ,s,t,dp);//take + notTake
            return dp[i][j];
        }
        dp[i][j] = countAllSub(i-1, j ,s,t,dp);//Not Match
        return dp[i][j];
    }
}