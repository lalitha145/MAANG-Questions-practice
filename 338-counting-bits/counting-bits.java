class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            int cnt=0;
            int t=i;
            while(t>1){
                int r=t%2;
                cnt+=r;
                t=t/2;
                
            }
            ans[i]=1+cnt;
        }
        return ans;
    }
}