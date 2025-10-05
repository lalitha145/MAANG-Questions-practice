class Solution {
    public long gridGame(int[][] grid) {
        long res=Long.MAX_VALUE;
        long row1Sum=0;
        long row2Sum=0;
        for(int i=0;i<grid[0].length;i++){
            row1Sum+=grid[0][i];
        }
        for(int i=0;i<grid[0].length;i++){
            row1Sum-=grid[0][i];
            System.out.println("Row1 "+row1Sum);
            res=Math.min(res,Math.max(row1Sum,row2Sum));
            row2Sum+=grid[1][i];
            System.out.println("Row2 " +row2Sum);
        }
        return res;
    }
}
