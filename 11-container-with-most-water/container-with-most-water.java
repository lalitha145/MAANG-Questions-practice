class Solution {
    public int maxArea(int[] height) {
        int leftMax=0,rightMax=0;
        int start=0,end=height.length-1;
        int ans=0;
        while(start<end){
            leftMax=Math.max(leftMax,height[start]);
            rightMax=Math.max(rightMax,height[end]);
            ans=Math.max(ans,Math.min(leftMax,rightMax)*(end-start));
            if(leftMax<=height[end]){
                start++;
            }else{
                end--;
            }
        }
        return ans;
    }
}