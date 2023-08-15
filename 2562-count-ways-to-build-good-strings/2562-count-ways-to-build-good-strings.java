class Solution {
    static int mod = 1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
       int ans=0;
       int dp[]=new int[high+1];
       Arrays.fill(dp,-1);
       for(int i=low;i<=high;i++){
           ans=ans%mod+helper(i,dp,low,high,zero,one)%mod;
       }
       return ans%mod;
    }
    static int helper(int i,int dp[],int l,int h,int z,int o){
        if(i==0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int first=helper(i-z,dp,l,h,z,o);
        int second=helper(i-o,dp,l,h,z,o);
        return dp[i]=(first%mod+second%mod)%mod;
    }
}