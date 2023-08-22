class Solution {
    public int maximizeWin(int[] a, int k) {
        int j=0;
        int i=0;
        int n = a.length;
        int dp[]=new int[n+1];
        int ans =0;
        for(i=0;i<a.length;i++)
        {
            while(a[i]-a[j]>k)
            j++;
            dp[i+1] = Math.max(dp[i],i-j+1);
            ans = Math.max(ans,dp[j]+i-j+1);

        }
        return ans;
    }
}