class Solution {
    public int numTrees(int n) {
        return helper(n);
    }
    int helper(int n){
        if(n<=1) return 1;
        int ans=0;
       
        for(int node=1;node<=n;node++){
            ans+=(helper(n-node)*helper(node-1));
        }
        return ans;
    }
}