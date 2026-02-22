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
                    // dfs(vis, grid, i,j);
                     bfs(vis, grid, i, j);
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
    void bfs(boolean vis[][],char grid[][], int i, int j){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        int dir[][]={{-1,0}, {0,-1}, {1,0},{0,1}};
        vis[i][j]=true;
        while(!q.isEmpty()){
            int []poll=q.poll();
            int r=poll[0];
            int c=poll[1];
            for(int d[]:dir){
                int nr=d[0]+r;
                int nc=d[1]+c;
                if(nr>=grid.length || nc>=grid[0].length ||nr<0 || nc<0 || vis[nr][nc] || grid[nr][nc]=='0') continue;
                q.add(new int[]{nr,nc});
                vis[nr][nc]=true;


            }
        }

    }
}