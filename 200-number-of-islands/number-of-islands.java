class Solution {
    public int numIslands(char[][] grid) {
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    dfs(i,j,vis,grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    void dfs(int i,int j,boolean vis[][],char grid[][]){
        vis[i][j]=true;
        int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
        for(int d[]:dir){
            int nr=i+d[0];
            int nc=j+d[1];
            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length  && !vis[nr][nc] && grid[nr][nc]=='1'){
                // vis[nr][nc]=true;
                dfs(nr,nc,vis,grid);
            }

        }
    }
}