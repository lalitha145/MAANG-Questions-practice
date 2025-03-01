class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
      
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int i=0,j=1;
        while(j<n){
            if(nums[j]!=0 && nums[i]==0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j++;
            }else if(nums[j]==0 && nums[i]!=0){
                i=j;
                //j++;
            }else{
                j++;
            }
        }
        return nums;
        
    }
}