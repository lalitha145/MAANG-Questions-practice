class Solution {
    public int uniquePathsIII(int[][] grid) {
        int empty=0;
        int sx=-1, sy=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) empty++;
                else if(grid[i][j]==1){
                    sx=i;
                    sy=j;
                }
            }
        }
        return helper(grid,empty+1,sx,sy);
    }
    int helper(int grid[][], int empty, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]<0) return 0;
        if(grid[i][j]==2){
            if(empty==0) return 1;
            else return 0;
        }
        int temp=grid[i][j];
        grid[i][j]=-1;
        int ch1=helper(grid,empty-1,i+1,j);
        int ch2=helper(grid,empty-1,i,j+1);
        int ch3=helper(grid,empty-1,i-1,j);
        int ch4=helper(grid,empty-1,i,j-1);
        grid[i][j]=temp;
        return ch1+ch2+ch3+ch4;



    }
}