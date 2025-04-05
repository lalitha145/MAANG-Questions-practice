class Solution {
    public int change(int amount, int[] coins) {

        int dp[][]=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0) dp[0][i]=1;
        }
        for(int i=1;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                int ch1=0;
                if(j-coins[i]>=0){
                 ch1=dp[i][j-coins[i]];
                }
                int ch2=dp[i-1][j];
                dp[i][j]=ch1+ch2;
            }
        }
        return dp[coins.length-1][amount];

    }
}