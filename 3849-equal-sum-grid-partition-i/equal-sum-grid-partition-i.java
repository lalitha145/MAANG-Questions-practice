class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;

        for(int a[]:grid){
            for(int ele:a) sum+=ele;
        }
        long tsum=sum;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                tsum-=grid[i][j];
                
            }
            if(2*tsum==sum) return true;
        }
        tsum=sum;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                tsum-=grid[j][i];
            }
            if(2*tsum==sum) return true;
        }
        return false;
    }
}