class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<j){
            while(i<j && nums[j]%2!=0){
                j--;
            }
            while(i<j && nums[i]%2==0){
                i++;
            }
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
        return nums;
    }
}