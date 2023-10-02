class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return helper(arr,k,0,dp);
    }
    static int helper(int a[],int k,int ind,int dp[]){
        if(ind==a.length){
            return 0;
        }
        int maxSum=Integer.MIN_VALUE;
        int len=0;
        int maxValue=Integer.MIN_VALUE;
        if(dp[ind]!=-1){
            return dp[ind];
        }
        for(int i=ind;i<Math.min(ind+k,a.length);i++){
            len++;
            maxValue=Math.max(maxValue,a[i]);
           
            int sum=(len*maxValue)+helper(a,k,i+1,dp);
            maxSum=Math.max(maxSum,sum);
        }
        return dp[ind]=maxSum;

    }
}