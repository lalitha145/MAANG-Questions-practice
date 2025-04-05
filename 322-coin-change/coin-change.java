class Solution {
    public int coinChange(int[] coins, int amount) {
         int dp[][]=new int[coins.length][amount+1];
         for(int i=0;i<coins.length;i++){
              Arrays.fill(dp[i],(int)1e9);
         }
         for(int i=0;i<=amount;i++){
             if(i%coins[0]==0){
                dp[0][i]=i/coins[0];
             }
         }

            for(int i=1;i<coins.length;i++){
                for(int amt=0;amt<=amount;amt++){
                 
                    int pick=(int)1e9;
                    if(amt>=coins[i]){
                      pick=1+dp[i][amt-coins[i]];
                    }
                    int np=dp[i-1][amt];
                    dp[i][amt]=Math.min(pick,np);
                }
            }
        int ans = dp[coins.length - 1][amount];
        return (ans >= (int)1e9) ? -1 : ans;
    }
   
}