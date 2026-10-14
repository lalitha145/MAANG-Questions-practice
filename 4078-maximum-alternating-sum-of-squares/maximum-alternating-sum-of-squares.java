class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]*=-1;
        }
        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        while(i<j){
            ans+=(nums[j]*nums[j]);
            ans-=(nums[i]*nums[i]);
            i++;
            j--;
        }
        if(i==j) ans+=(nums[i]*nums[i]);
        return ans;
        
    }
}