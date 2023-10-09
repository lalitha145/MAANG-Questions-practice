class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length>1){
            return false;
        }
        int f=nums[0];
        int ind=1;
        for(int i=1;i<nums.length;i++){
            f=Math.max(f,nums[i]+i);
            if(ind==i){
                ind=f;
            }
        }
        return ind>=nums.length-1;
    }
}