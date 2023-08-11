class Solution {
    public int lengthOfLIS(int[] nums) {
        int pre=-1;
        int dp[][]=new int[nums.length][nums.length];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return helper(dp,nums,0,pre);
        
    }
    static int helper(int dp[][],int nums[],int ind,int pre){
        if(ind==nums.length){
            return 0;
        }
        if(dp[pre+1][ind]!=-1){
            return dp[pre+1][ind];
        }
        int pick=0;
        if(pre==-1 || nums[pre]<nums[ind]){
            pick=1+helper(dp,nums,ind+1,ind);
        }
        int np=helper(dp,nums,ind+1,pre);
        return dp[pre+1][ind]=Math.max(pick,np);
    }
}