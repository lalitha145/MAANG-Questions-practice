class Solution {
    public int countSubarrays(int[] nums) {
        int ans=0;
        for(int i=0;i<=nums.length-3;i++){
            if((double)(nums[i]+nums[i+2])==(double)(nums[i+1]/2.0)){
                System.out.println(nums[i]+"  "+nums[i+1]);
                ans++;
            }
        }
        return ans;
    }
}