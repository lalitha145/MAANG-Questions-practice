class Solution {
    public int[] productExceptSelf(int[] nums) {
      int pre=1;
      int suff=1;
      int ans[]=new int[nums.length];
      Arrays.fill(ans,1);
      for(int i=0;i<nums.length;i++){
        ans[i]=pre;
        pre=pre*nums[i];
      }
      for(int i=nums.length-1;i>=0;i--){
        ans[i]*=suff;
        suff=suff*nums[i];
      }
      return ans;

    }
}