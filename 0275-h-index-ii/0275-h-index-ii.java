class Solution {
    public int hIndex(int[] nums) {
        int dp[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        dp[i]=nums.length-i;
       }
       for(int i=0;i<dp.length;i++){
           if(nums[i]>=dp[i]){
               return dp[i];
           }
       }
       return 0;
    
    }
}