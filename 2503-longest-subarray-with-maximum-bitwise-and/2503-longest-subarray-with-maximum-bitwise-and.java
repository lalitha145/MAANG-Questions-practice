class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i:nums){
            if(max<i){
                max=i;
            }
        }
        int c=0;
        int ans=0;
        for(int i:nums){
            if(i==max){
                c++;
               ans=Math.max(ans,c);
            }else{
                c=0;
            }

        }
        return ans;
    }
}