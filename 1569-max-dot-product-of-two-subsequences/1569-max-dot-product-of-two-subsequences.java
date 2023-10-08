class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int dp[][]=new int[nums1.length+1][nums2.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
      return helper(dp,nums1,nums2,0,0);  
    }
    static int helper(int dp[][],int a1[],int a2[],int i,int j){
        if(i>=a1.length || j>=a2.length){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        return dp[i][j]=Math.max(a1[i]*a2[j]+Math.max(helper(dp,a1,a2,i+1,j+1),0),Math.max(helper(dp,a1,a2,i+1,j),helper(dp,a1,a2,i,j+1)));
        
    }
}