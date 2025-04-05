class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int a[]:dp) Arrays.fill(a,-1);
        return helper(amount,coins,coins.length-1,dp);
    }
    int helper(int amount,int coins[], int ind,int dp[][]){
        if(amount==0) return 1;
        if(amount<0 || ind<0) return 0;
        if(dp[ind][amount]!=-1) return dp[ind][amount];
        int ch1=helper(amount-coins[ind], coins, ind,dp);
        int ch2=helper(amount, coins, ind-1,dp);
        return dp[ind][amount]=ch1+ch2;
    }
}