class Solution {
    public int minSwaps(int[] nums) {
        int min=nums.length;
        int ones=0;
        int n=nums.length;
        for(int ele:nums){
            ones+=ele;
        }
        int k=ones;
       
        int cntOnes=0;
        for(int i=0;i<k;i++){
            if(nums[i]==1) cntOnes++;
        }
        for(int i=k;i<nums.length+k;i++){
            cntOnes+=(nums[i%n]-nums[(i-k+n)%n]);
            min=Math.min(min,k-cntOnes);
        }
        return min;
       

    }
}