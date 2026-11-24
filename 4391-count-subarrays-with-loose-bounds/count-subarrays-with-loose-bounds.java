class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int start=0;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int end=0;end<nums.length;end++){
            min=Math.min(min,nums[end]);
            max=Math.max(max,nums[end]);
            //System.out.println(start+"  "+end+"  "+min+"   "+max);
            if(min>=minK && max<=maxK){
                ans+=(end-start+1);
            }else{
                start=end+1;
                min=Long.MAX_VALUE;
                max=Long.MIN_VALUE;
            }
        }
        return ans;
    }
}