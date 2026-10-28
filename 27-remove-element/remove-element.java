class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        if(nums.length<=1 && nums[0]==val) return 0;
        int i=0, j=nums.length-1;
        while(i<j){
            while(i<j && nums[i]!=val){
                i++;
            }
            while(i<j && nums[j]==val){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int ans=0;
        for(int k=nums.length-1;k>=0;k--){
            if(nums[k]!=val) return k+1;
        }
        return 0;
    }
}