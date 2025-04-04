class Solution {
    public int climbStairs(int n) {
         int memo[]=new int[n+1];
         Arrays.fill(memo,-1);
        return helper(memo,n);
    }
    int helper(int memo[], int n){
       if(n==0){
        return 1;
       }
       if(n<0) return 0;
       if(memo[n]!=-1) return memo[n];
       int ch1=helper(memo,n-1);
       int ch2=helper(memo, n-2);
       memo[n]=ch1+ch2;
       return memo[n];
    }
}