class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
      
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==0 && nums[j]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
            }else if(nums[j]==0 && nums[i]!=0){
                i=j;
            }
        }

        return nums;
        
    }
}