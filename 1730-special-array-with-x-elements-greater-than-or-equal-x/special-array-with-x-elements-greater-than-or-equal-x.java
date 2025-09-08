class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=0, high=nums[n-1];
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(mid,nums)==mid){
              return mid;
            }else if(helper(mid, nums)<mid){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    int helper(int mid, int nums[]){
        int cnt=0;
        for(int ele:nums){
            if(ele>=mid) cnt++;
        }
        return cnt;

    }
}