class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        boolean dp[][]=new boolean[nums.length][target+1];
        for(int i=0;i<nums.length;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<=target;j++){
                boolean np=dp[i-1][j];
                boolean pick=false;
                if(nums[i]<=j){
                    pick=dp[i-1][j-nums[i]];
                }
                dp[i][j]=pick || np;
            }
        }
        return dp[nums.length-1][target];
    }
   
}