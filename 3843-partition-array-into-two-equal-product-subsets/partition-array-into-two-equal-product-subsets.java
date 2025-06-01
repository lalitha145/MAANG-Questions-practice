class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        long pro=1;
        for(int ele:nums) pro*=ele;
        if(pro!=target*target) return false;
        System.out.println(pro/target);
        return helper(nums,target, 1 ,0);
    }
    boolean helper(int nums[], long target, long pro, int i){
        if(i>=nums.length) return false;
        // System.out.println("pro :"+pro);
        if(pro==target) return true;
        boolean pick=helper(nums, target, pro*nums[i], i+1);
        boolean np=helper(nums,target, pro, i+1);
        return pick|np;
    }
}
