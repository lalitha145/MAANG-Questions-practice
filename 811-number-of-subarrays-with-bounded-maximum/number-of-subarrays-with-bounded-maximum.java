class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
       int ind = 0;
       return count(nums, right)-count(nums, left-1);
    }
    int count(int nums[], int max){
        int cnt=0;
        int temp=0;
        for(int ele:nums){
            if(ele<=max){
                temp++;
            }else{
                temp=0;
            }
            cnt+=temp;

        }
        return cnt;
    }
}