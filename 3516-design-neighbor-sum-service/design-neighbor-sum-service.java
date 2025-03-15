class NeighborSum {
        HashMap<Integer,int[]> map=new HashMap<>();
        int g[][];
    public NeighborSum(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                map.put(grid[i][j],new int[]{i,j});
            }
        }
        g=grid;
    }
    
    public int adjacentSum(int value) {
        int ans=0;
        int[] a=map.get(value);
        int r=a[0],c=a[1];
        if(r-1>=0) ans+=g[r-1][c];
        if(c-1>=0) ans+=g[r][c-1];
        if(r+1<g.length) ans+=g[r+1][c];
        if(c+1<g[0].length) ans+=g[r][c+1];
        return ans;
    }
    
    public int diagonalSum(int value) {
        int ans=0;
        int a[]=map.get(value);
        int r=a[0],c=a[1];
        if(r+1<g.length && c-1>=0) ans+=g[r+1][c-1];
        if(r+1<g.length && c+1<g[0].length) ans+=g[r+1][c+1];
        if(r-1>=0 && c+1<g[0].length) ans+=g[r-1][c+1];
        if(r-1>=0 && c-1>=0) ans+=g[r-1][c-1];
        return ans;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */