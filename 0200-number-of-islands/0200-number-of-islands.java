class Solution {
    public int numIslands(char[][] grid) {
      int ans=0;
      boolean vis[][]=new boolean[grid.length][grid[0].length];
      for(int i=0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
              if(!vis[i][j] && grid[i][j]=='1'){
                  dfs(vis,grid,i,j);
                  ans++;
              }
          }
      }
      return ans;
    }
    static void dfs(boolean vis[][],char grid[][],int i1,int j1){
        vis[i1][j1]=true;
        int row[]={-1,0,+1,0};
        int col[]={0,+1,0,-1};
        for(int i=0;i<4;i++){
            int nr=row[i]+i1;
            int nc=col[i]+j1;
            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && !vis[nr][nc] && grid[nr][nc]=='1'){
                 dfs(vis,grid,nr,nc);
            }
        }
    }

}