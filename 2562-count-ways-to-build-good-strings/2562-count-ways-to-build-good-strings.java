class Solution {
    int mod = 1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
        int ans = 0;
        int[] dp = new int[high + 1];
        Arrays.fill(dp, -1);
        for(int i = low; i <= high; i++){
            // ans = ((ans) % mod + (helper(i, high, low, zero, one)) % mod) % mod;
            ans = ((ans) % mod + (helperMem(i, low, high, zero, one, dp)) % mod) % mod;
        }
        return ans;
    }


    public int helperMem(int val, int low, int high, int zero, int one, int[] dp){
        if(val == 0) return 1;
        if(val < 0) return 0;
        if(dp[val] != -1) return dp[val];
        int first = helperMem(val - zero, low, high, zero, one, dp);
        int second = helperMem(val - one, low, high, zero, one, dp);
        return dp[val] = (first + second) % mod;
    }
}