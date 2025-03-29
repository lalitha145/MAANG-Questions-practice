class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int ans=0;
        boolean vis[][]=new boolean[m][n];
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==m-1 || j==n-1 || i==0 || j==0){
                    if(grid[i][j]==1){
                        dfs(i,j,vis,grid,dir);
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==false && grid[i][j]==1) ans++;
            }
        }
        return ans;
    }
    void dfs(int i,int j,boolean vis[][],int grid[][],int dir[][]){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || vis[i][j] || grid[i][j]==0){
            return;

        }
        vis[i][j]=true;
        for(int d[]:dir){
            int nr=d[0]+i;
            int nc=d[1]+j;
            dfs(nr,nc,vis,grid,dir);

        }
    }


}