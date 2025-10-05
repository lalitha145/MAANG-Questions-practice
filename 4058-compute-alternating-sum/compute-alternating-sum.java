class Solution {
    public int alternatingSum(int[] nums) {
        int ans=0;
        int f=1;
        for(int ele:nums){
            ans+=f*ele;
            f=f*-1;

        }
        return ans;
    }
}