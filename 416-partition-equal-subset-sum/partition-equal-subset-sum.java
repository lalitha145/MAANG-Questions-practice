class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int ele:nums) totalSum+=ele;
        if(totalSum%2==1) return false;
        int target=(totalSum)/2;
        boolean dp[][]=new boolean[nums.length][target+1];
    //     for(int d[]:dp) Arrays.fill(d,-1);
    //     return helper(nums,target,0,dp);
    // }
    // boolean helper(int nums[],int target,int i,int dp[][]){
    //     if(target==0) return true;
    //     if(i>=nums.length || target<0) return false;
    //     if(dp[i][target]!=-1) return dp[i][target]==1?true:false;
    //     boolean ans= helper(nums,target-nums[i],i+1,dp) || helper(nums,target,i+1,dp);
    //     dp[i][target]=ans==true?1:-1;
    //     return ans;
        
        for(int i=0;i<nums.length;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<nums.length;i++){
            for(int t=0;t<=target;t++){
                boolean np=dp[i-1][t];
                boolean pick=false;
                if(nums[i]<=t){
                    pick=dp[i-1][t-nums[i]];
                }
                dp[i][t]=pick|| np;
            }
        }
        return dp[nums.length-1][target];

    }
}