class Solution {
    public long mostPoints(int[][] q) {
        long dp[]=new long[q.length+1];

        return helper(dp,q,0);
    }
    static long helper(long dp[],int q[][],int i){
        if(i>=q.length){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        long pick=0;
        pick=q[i][0]+helper(dp,q,i+q[i][1]+1);
        long np=helper(dp,q,i+1);
        return dp[i]=Math.max(pick,np);

    }

}