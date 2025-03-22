class Solution {
    public int search(int[] nums, int target) {
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            System.out.println("low "+low+"  high "+high);
            if(nums[mid]==target) return mid;
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>=target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                 if(nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }else{
                   high=mid-1;
                }
            }
        }
        return -1;
    }
}
// [1,2,3,4,5,6]
// [5,6,1,,2,3,4]
