class Solution {
    public int minCapability(int[] nums, int k) {
        int low=1, high=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(mid,nums,k)){
                ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean helper(int mid,int nums[],int k){
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                cnt++;
                i++;
            }
        }
        return cnt>=k;
    }
}