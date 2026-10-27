class Solution {
    public void nextPermutation(int[] nums) {
      int inf=-1;
      for(int i=nums.length-1;i>0;i--){
        if(nums[i]>nums[i-1]){
            inf=i;
            break;
        }
      }
      if(inf==-1){
        Arrays.sort(nums);
        return;
      }
      int toswap=nums[inf-1];
      int nextMin=Integer.MAX_VALUE;
      int index=-1;
      for(int i=inf;i<nums.length;i++){
        if(toswap<nums[i]){
           int t=nums[i];
           nums[i]=nums[inf-1];
           nums[inf-1]=t;
        }
      }
     
      Arrays.sort(nums, inf, nums.length);
      return;

    }
}