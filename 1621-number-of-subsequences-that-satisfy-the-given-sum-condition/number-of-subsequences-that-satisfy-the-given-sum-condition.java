class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod=1000000007;
        int pow[]=new int[nums.length];
        int left=0, right=nums.length-1;
        int count=0;
        pow[0]=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            pow[i]=(pow[i-1]*2)%mod;
        }
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                count=(count+pow[right-left])%mod;
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}