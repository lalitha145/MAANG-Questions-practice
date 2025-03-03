class Solution {

    public int maxAreaOfIsland(int[][] grid) {
         boolean vis[][]=new boolean[grid.length][grid[0].length];
        int cnt=0;
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]==1){
                   max=Math.max(max, dfs(i,j,vis,grid));
                }
            }
        }
        return max;
    }
    int dfs(int i,int j,boolean vis[][],int grid[][]){
        
        vis[i][j]=true;
        int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
        int ans=1;
        for(int d[]:dir){
            int nr=i+d[0];
            int nc=j+d[1];
            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length  && !vis[nr][nc] && grid[nr][nc]==1){
                vis[nr][nc]=true;
                ans+=dfs(nr,nc,vis,grid);
            }

        }
     return ans;
    }
}