class Solution {
    public int[] searchRange(int[] nums, int target) {
   int lb=lowerBound(nums,target);
   int ub=upperBound(nums,target);
   if(lb==nums.length || nums[lb]!=target){
       return new int[]{-1,-1};
   }
   return new int[]{lb,ub-1};
  }
  int lowerBound(int nums[],int t){
      int low=0;
      int high=nums.length-1;
      int ans=nums.length;
      while(low<=high){
          int mid=(low+high)/2;
          if(nums[mid]>=t){
              ans=mid;
              high=mid-1;
          }else{
              low=mid+1;

          }
      }
      return ans;
  }
    int upperBound(int nums[],int t){
      int low=0;
      int high=nums.length-1;
      int ans=nums.length;

   while(low<=high){
          int mid=(low+high)/2;
          if(nums[mid]>t){
              ans=mid;
              high=mid-1;
          }else{
              low=mid+1;
              
          }
      
}
return ans;
}
}