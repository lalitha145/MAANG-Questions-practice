class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
      
            Arrays.fill(dp,-1);
        
        return Math.min(helper(dp,cost,0),helper(dp,cost,1));
    }
 int helper(int dp[],int cost[],int i){
     if(i>=cost.length){
         return 0;
     }
     if(dp[i]!=-1){
         return dp[i];
     }
     int ans=0;
    ans=cost[i]+Math.min(helper(dp,cost,i+1),helper(dp,cost,i+2));
    return dp[i]= ans;
 }
}