class Solution {
    public long minCost(int[] nums) {
        long ans=nums[0]+nums[nums.length-1];
        long negSum=0;
        long largestNeg=(long)-1e9;
        long smallestPositive=(long)1e9;
        int negCnt=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]<0){
                negSum+=(long)nums[i];
                negCnt++;
                largestNeg=Math.max(largestNeg,(long)nums[i]);
            }else{
                smallestPositive=Math.min(smallestPositive, (long)nums[i]);
            }
        }
        if(negCnt%2==0){
            return (long)ans+(long)negSum;
        }
        long choice1=ans+negSum-largestNeg;
        long choice2=ans+negSum+smallestPositive;
        return Math.min(choice1,choice2);
    }
}