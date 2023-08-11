class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return helper(dp,amount,coins,coins.length-1);
    }
    static int helper(int dp[][],int a,int c[],int i){
        if(a==0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i][a]!=-1){
            return dp[i][a];
        }
        
        int pick=0;
        if(c[i]<=a){
            pick=helper(dp,a-c[i],c,i);
        }
        int np=helper(dp,a,c,i-1);
        return dp[i][a]=pick+np;
    }
}