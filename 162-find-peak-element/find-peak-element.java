class Solution {
       public int findPeakElement(int[] nums) {
       int low=0;
       int high=nums.length-1;
       while(low<=high){
           int mid=(low+high)/2;
           if(mid<nums.length-1 && nums[mid]<=nums[mid+1]){
               low=mid+1;
           }else{
               high=mid-1;
           }
       }
        return low;
    }
}