class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums, nums.length-1, dp);
    }
    int helper(int nums[], int ind,int dp[]){
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int pick=nums[ind]+helper(nums,ind-2,dp);
        int np=helper(nums,ind-1,dp);
        return dp[ind]=Math.max(pick, np);
    }
}