class Solution {
    public int smallestIndex(int[] nums) {
        int i=0;
        for(int ele:nums){
            if(helper(ele)==i) return i;
            i++;
        }
        return -1;
    }
    int helper(int ele){
        int sum=0;
        while(ele>0){
            sum+=ele%10;
            ele/=10;
        }
        return sum;
    }
}