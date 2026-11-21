class Solution {
    public int minMoves(int[] nums) {
        int ans=0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int ele: nums){
            ans+=max-ele;
        }
        return ans;
    }
}