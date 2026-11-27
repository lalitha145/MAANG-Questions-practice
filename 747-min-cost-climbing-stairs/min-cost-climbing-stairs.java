class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        int n=cost.length;
    //     Arrays.fill(dp,-1);
    //     return Math.min(findMin(cost,n-1,dp),findMin(cost,n-2,dp));
    // }
    // int findMin(int cost[], int ind,int dp[]){
    //     if(ind<0) return 0;
    //     if(ind==0 || ind==1) return cost[ind];
    //     if(dp[ind]!=-1) return dp[ind];
    //     int ch1=cost[ind]+findMin(cost,ind-1,dp);
    //     int ch2=cost[ind]+findMin(cost,ind-2,dp);
    //     return dp[ind]=Math.min(ch1,ch2);
    // }
    //  dp[0]=cost[0];
    //  dp[1]=cost[1];
    //  for(int i=2;i<cost.length;i++){
    //     dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
    //  }
    //  return  Math.min(dp[n-1],dp[n-2]);
    // }

    int first=cost[0];
    int second=cost[1];
    for(int i=2;i<cost.length;i++){
        int curr=cost[i]+Math.min(first,second);
        first=second;
        second=curr;
    }
    return Math.min(first,second);
    }
}