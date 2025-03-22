class Solution {
    public int maxSubArray(int[] nums) {

        int min=nums[0];
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0) sum=0;
            min=Math.min(min,nums[i]);
        }
        // ans=Math.max(ans,min);
        return ans;
    }
}