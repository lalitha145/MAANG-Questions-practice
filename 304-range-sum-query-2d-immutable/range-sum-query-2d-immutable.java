class NumMatrix {
    int a[][];
    public NumMatrix(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        a=new int[m+1][n+1];
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a[0].length;j++){
                a[i][j]=a[i][j-1]+a[i-1][j]-a[i-1][j-1]+matrix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return a[row2+1][col2+1]-a[row1][col2+1]-a[row2+1][col1]+a[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */