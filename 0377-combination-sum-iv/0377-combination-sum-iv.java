class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[]=new int[target+1];
        Arrays.fill(dp,-1);
        return helper(dp,nums,target);
    }
    static int helper(int dp[],int n[],int t){
        if(t<0){
            return 0;
        }
        if(t==0){
            return 1;
        }
        if(dp[t]!=-1){
            return dp[t];
        }
        int ways=0;
        for(int j=0;j<n.length;j++){
            ways=ways+helper(dp,n,t-n[j]);
        }
        return dp[t]=ways;
    }
}