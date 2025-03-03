class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[]=new int[nums.length];
        int equal=0,small=0,large=0;
        for(int ele:nums){
            if(ele>pivot) large++;
            else if(ele<pivot) small++;
            else equal++;
        }
        int left=0, mid=small, right=mid+equal;
        for(int ele:nums){
            if(ele<pivot){
                res[left++]=ele;
            }else if(ele>pivot){
                res[right++]=ele;
            }else{
                res[mid++]=ele;
            }
        }
       return res;

    }
}