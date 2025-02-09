class Solution {
    public int[][] sortMatrix(int[][] grid) {
        for(int col=1;col<grid.length-1;col++){
            sortAsc(0,col,grid);
        }
        for(int r = 0; r < grid.length-1; r++) {
            sortDesc(r,0,grid);
        }

        return grid;
    }
    void sortAsc(int row,int col,int grid[][]){
      int rowInd=grid.length-1;
      while(rowInd>0){
        int colStart=col;
        int rowStart=row;
        while(colStart<rowInd && rowStart<rowInd){
            if(grid[rowStart][colStart]>grid[rowStart+1][colStart+1]){
                int temp=grid[rowStart][colStart];
                grid[rowStart][colStart]=grid[rowStart+1][colStart+1];
                grid[rowStart+1][colStart+1]=temp;
            }
            colStart++;
            rowStart++;
        }
        rowInd--;
      }
   
    }

    void sortDesc(int row,int col,int grid[][]){
      int rowInd=grid.length-1;
      while(rowInd>0){
        int colStart=col;
        int rowStart=row;
        while(colStart<rowInd && rowStart<rowInd){
            if(grid[rowStart][colStart]<grid[rowStart+1][colStart+1]){
                int temp=grid[rowStart][colStart];
                grid[rowStart][colStart]=grid[rowStart+1][colStart+1];
                grid[rowStart+1][colStart+1]=temp;
            }
            colStart++;
            rowStart++;
        }
        rowInd--;
      }

    }
}