class Solution {
    public int orangesRotting(int[][] grid) {
       // if(grid.length==1 && grid[0][0]==0) return 0;
       boolean isFresh=false;
        Queue<int[]> q=new LinkedList<>();
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) isFresh=true;
                if(grid[i][j]==2){
                    vis[i][j]=true;
                    q.add(new int[]{i,j});
                }
            }
        }
        int level=0;
        int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
  
      if(isFresh==false) return 0;
       if(q.isEmpty()) return -1;
        while(!q.isEmpty()){
            int size=q.size();
            level++;
            for(int i1=0;i1<size;i1++){
                int poll[]=q.poll();
                int row=poll[0];
                int col=poll[1];
                for(int d[]:dir){
                    int i=row+d[0];
                    int j=col+d[1];
                    if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && !vis[i][j] && grid[i][j]==1){
                        vis[i][j]=true;
                        q.add(new int[]{i,j});
                    }
                }
            }
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j]==false && grid[i][j]!=0) return -1;
            }
        }
        return level-1;
    }
}