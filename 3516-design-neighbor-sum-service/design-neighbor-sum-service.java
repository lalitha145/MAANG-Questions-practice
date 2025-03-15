class NeighborSum {
        HashMap<Integer,int[]> map=new HashMap<>();
        int g[][];
        int adj[][]={{-1,0},{0,-1},{1,0},{0,1}};
        int dia[][]={{-1,-1},{-1,1},{1,-1},{1,1}};
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
        for(int d[]:adj){
            int nr=d[0]+r;
            int nc=d[1]+c;
            if(valid(nr,nc,g.length,g[0].length)) ans+=g[nr][nc];
        }
        return ans;
    }
    
    public int diagonalSum(int value) {
        int ans=0;
        int a[]=map.get(value);
        int r=a[0],c=a[1];
        for(int d[]:dia){
            int nr=d[0]+r;
            int nc=d[1]+c;
            if(valid(nr,nc,g.length,g[0].length)) ans+=g[nr][nc];
        }
        return ans;
    }
    boolean valid(int i,int j,int m,int n){
        return i>=0 && j>=0 && i<m && j<n;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */