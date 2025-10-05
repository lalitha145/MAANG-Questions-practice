class Solution {
    public int longestSubsequence(int[] nums) {
        int cnt=0,xor=0;
        for(int ele:nums){
            xor=xor^ele;
            if(xor==0) cnt++;
        }
        if(cnt==nums.length) return 0;
        if(xor==0) return nums.length-1;
        return nums.length;
    }
}