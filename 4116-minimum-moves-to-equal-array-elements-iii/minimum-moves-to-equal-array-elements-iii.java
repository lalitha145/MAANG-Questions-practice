class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int max=0;
        for(int ele: nums){
            sum+=ele;
            max=Math.max(max,ele);
        }
        return max*nums.length-sum;
    }
}