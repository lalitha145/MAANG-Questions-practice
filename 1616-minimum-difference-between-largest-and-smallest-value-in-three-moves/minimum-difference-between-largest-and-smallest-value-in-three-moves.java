class Solution {
    public int minDifference(int[] A) {
        int n=A.length;
        if(A.length<=3) return 0;
        Arrays.sort(A);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<4;i++){
            ans=Math.min(ans,A[n-4+i]-A[i]);
        }
        return ans;
    }
}