class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int dp[][]=new int[nums1.length+1][nums2.length+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return helper(dp,nums1,nums2,0,0);
    }
    static int helper(int dp[][],int n1[],int n2[],int i,int j){
        if(i>=n1.length || j>=n2.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int p=0;

        if(n1[i]==n2[j]){
           p= 1+helper(dp,n1,n2,i+1,j+1); 
        }
        int np=Math.max(helper(dp,n1,n2,i+1,j),helper(dp,n1,n2,i,j+1));
        return dp[i][j]=Math.max(p,np);
    }
}