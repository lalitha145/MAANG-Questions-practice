class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int count=0;
        for(int i=0;i<n;i++){
           
            for(int j=i+1;j<n;j++){
                 int max=0;
                
                for(int a[]:roads){
                    if(a[0]==i || a[0]==j || a[1]==i || a[1]==j){
                        max++;
                    }
                }
                count=Math.max(count,max);

            }
            
        }
        return count;
    }
}