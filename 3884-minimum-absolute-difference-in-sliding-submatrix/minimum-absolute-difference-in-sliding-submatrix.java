class Solution {
    public int[][] minAbsDiff(int[][] mat, int k) {
        int m=mat.length, n=mat[0].length;
        int ans[][]=new int[m-k+1][n-k+1];
        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                int a[]=new int[k*k];
                int l=0;
                for (int x = 0; x < k; x++) {
                    for (int y = 0; y < k; y++) {
                        a[l++]=mat[x+i][y+j];
                         
                    }
                    
                }
                Arrays.sort(a);
                for(int i1=0;i1<a.length-1;i1++){
                    if(a[i1]!=a[i1+1]){
                    min=Math.min(min, a[i1+1]-a[i1]);
                    }
                }
                if(min== Integer.MAX_VALUE){
                    min=0;
                }
                ans[i][j]=min;
            }
         }
         return ans;

    }
}
