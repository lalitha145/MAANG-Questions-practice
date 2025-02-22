class Solution {
    public long maximumPoints(int[] nums, int currentEnergy) {
       long ans=0;
       Arrays.sort(nums);
       if(currentEnergy<nums[0]) return 0;
       long sum=currentEnergy;
       for(int i=1;i<nums.length;i++){
        sum+=nums[i];
       }
       if(sum<nums[0]) return 0;
       return sum/nums[0];
    }
}