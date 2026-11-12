class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1) return 1;
        int inc=0, dec=0;
        int cnt1=1,cnt2=1;
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]<nums[i+1]){
            cnt1++;
          }else{
            cnt1=1;
          }
          inc=Math.max(inc,cnt1);

        }
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]>nums[i+1]){
            cnt2++;
          }else{
            cnt2=1;
          }
          dec=Math.max(dec,cnt2);

        }
        return Math.max(inc, dec);
    }
}