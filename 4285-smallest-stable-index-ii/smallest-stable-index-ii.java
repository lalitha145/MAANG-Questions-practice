class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxL[]=new int[nums.length];
        int minR[]=new int[nums.length];
        maxL[0]=nums[0];
        minR[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            maxL[i]=Math.max(maxL[i-1],nums[i]);
        }
        for(int i=nums.length-2;i>=0;i--){
            minR[i]=Math.min(minR[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(maxL[i]-minR[i]<=k){
                return i;
            }
        }
        return -1;
        
    }
}