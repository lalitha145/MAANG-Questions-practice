class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0, right=n-1;
        int maxLeft=height[0];
        int maxRight=height[n-1];
        int ans=0;
        while(left<right){
            if(maxLeft<height[left]){
                maxLeft=height[left];

            }
            if(maxRight<height[right]){
                maxRight=height[right];
            }
            ans=Math.max(ans,Math.min(maxLeft,maxRight)*(right-left));
            if(maxLeft<maxRight){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}