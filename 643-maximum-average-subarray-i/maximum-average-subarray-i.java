class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=Integer.MIN_VALUE;
        int start=0, end=0;
        double sum=0;
        if(nums.length==1) return (double)(nums[0]/k);
        for(end=0;end<k;end++){
            sum+=(double)nums[end];
        }
        //end=k;
        ans=Math.max(ans, sum/k);
        
        while(end<nums.length){
            sum+=(double)nums[end];  
            sum-=nums[start++];
            if(end-start+1==k) {
                ans=Math.max(ans, sum/k);
            }
            
            end++;

        }
        return ans;
    }
}