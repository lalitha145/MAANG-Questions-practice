class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(nums,mid,k)){
                low=mid+1;
            }else{
                ans=mid;
               high=mid-1;
            }
        }
        return ans;

    }
    boolean helper(int nums[],int mid,int k){
        int splits=1;
        int sum=0;
        for(int ele:nums){
            if(sum+ele<=mid){
                sum=sum+ele;
            }else{
                splits++;
                sum=ele;
            }
        }
        return splits>k;
    }
    //  static boolean helper(int mid,int nums[],int k){
    //     int split=1;
    //     int sum=0;
    //     for(int i:nums){
    //       if(sum+i<=mid){
    //           sum+=i;
    //       }else{
    //           split++;
    //           sum=i;
    //       }

    //     }
    //     return split>k;
    // }
}