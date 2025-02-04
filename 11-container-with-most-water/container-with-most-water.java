class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        int maxLeft=0, maxRight=0;
        while(left<right){
             maxLeft=Math.max(maxLeft,height[left]);
             maxRight=Math.max(maxRight,height[right]);
            int minHeight=Math.min(maxLeft,maxRight);
            ans=Math.max((right-left)*minHeight,ans);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}