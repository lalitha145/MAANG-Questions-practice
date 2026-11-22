class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length==1) return 1;
        int cnt=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>=((int)(double)(nums[i-1]+nums[i+1])/2.0)) cnt++;
        }
        if(nums.length>=2 && nums[0]>=nums[1]) cnt++;
        if(nums.length>=2 && nums[nums.length-1]>=nums[nums.length-2]) cnt++;
        return cnt;
    }
}