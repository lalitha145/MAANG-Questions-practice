class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length; 
        int n=grid[0].length;
        int cnt=0;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                     cnt++;
                     dfs(vis, grid, i,j);
                }
            }
        }
        return cnt;
    }
    void dfs(boolean vis[][], char grid[][], int i, int j){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]=='0' || vis[i][j]){
            return;
        }
        vis[i][j]=true;
        int dir[][]={{-1,0}, {0,-1}, {1,0},{0,1}};
        for(int d[]:dir){
            int nr=d[0]+i;
            int nc=d[1]+j;
            dfs(vis,grid, nr,nc);
        }

    }
}