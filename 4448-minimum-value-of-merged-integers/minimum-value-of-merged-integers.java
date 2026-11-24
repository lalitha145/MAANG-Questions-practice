class Solution {
    public int minMergedInteger(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i+=2){
            String s=String.valueOf(nums[i]);
            s+=nums[i+1];
            ans=Math.min(ans, Integer.parseInt(s));
        }
        return ans;
    }
}