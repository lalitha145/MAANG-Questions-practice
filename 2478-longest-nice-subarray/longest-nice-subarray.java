class Solution {
    public int longestNiceSubarray(int[] nums) {
       int used=0,max=0,start=0;
       for(int end=0;end<nums.length;end++){
          while((nums[end] & used)!=0){
            used^=nums[start++];
          }
          used|=nums[end];
          max=Math.max(max,end-start+1);
       }
       return max;
    }
}