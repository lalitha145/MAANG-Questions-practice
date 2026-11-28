class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int prev=2;
        int p_prev=1;
        for(int i=3;i<=n;i++){
            int curr=prev+p_prev;
            p_prev=prev;
            prev=curr;
        }
        return prev;

    }
 
}