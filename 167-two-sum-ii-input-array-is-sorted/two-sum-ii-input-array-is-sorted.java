class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0, right=nums.length-1;
        int sum=0;
        while(left<right){
            sum=nums[left]+nums[right];
            if(sum==target) return new int[]{left+1,right+1};
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}