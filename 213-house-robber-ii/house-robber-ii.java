class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
         Arrays.fill(dp,-1);
        int ans1=helper(nums,nums.length-1,true,dp);
        Arrays.fill(dp,-1);
        int ans2=helper(nums,nums.length-2,false,dp);
        if(nums.length==1) return nums[0];

        return Math.max(ans1,ans2);
    }
    int helper(int nums[], int ind , boolean flag,int dp[]){
        if(flag==true){
            if(ind==0) return 0;
         }
         if(ind<0) return 0;
         if(dp[ind]!=-1) return dp[ind];
         
        int pick=nums[ind]+helper(nums,ind-2,flag,dp);
        int np=0+helper(nums,ind-1,flag,dp);
        return dp[ind]=Math.max(pick,np);
    }
}