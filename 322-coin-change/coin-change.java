class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        int ans=helper(coins,amount,coins.length-1,dp);
        return ans>=(int)1e9?-1:ans;
    }
    int helper(int coins[], int amt, int ind,int dp[][]){
        if(ind<0|| amt<0) return (int)1e9;
        if(amt==0) return 0;
        if(dp[ind][amt]!=-1) return dp[ind][amt];
        int pick=1+helper(coins,amt-coins[ind],ind,dp);
        int np=0+helper(coins,amt,ind-1,dp);
        return dp[ind][amt]=Math.min(pick,np);
    }
}