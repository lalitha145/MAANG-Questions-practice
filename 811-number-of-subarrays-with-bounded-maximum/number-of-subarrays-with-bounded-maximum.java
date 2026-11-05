class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return helper(nums, right)-helper(nums,left-1);
    }
    int helper(int nums[], int max){
        int cnt=0;
        int ans=0;
        for(int ele: nums){
            if(ele<=max){
                cnt++;
            }else{
                cnt=0;
            }

            ans+=cnt;
        }
        return ans;
    }
}