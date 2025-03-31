class Pair {
    int row,col,dis;
    public Pair(int row,int col,int dis){
        this.row=row;
        this.col=col;
        this.dis=dis;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dis-b.dis);
        int m=grid.length,n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
      
        if(grid[0][0]==1 || grid[m-1][n-1]==1) return -1;
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1},{1,1},{1,-1},{-1,1},{-1,-1}};
        pq.add(new Pair(0,0,1));
        vis[0][0]=true;
        while(!pq.isEmpty()){
            Pair poll=pq.poll();
            int row=poll.row;
            int col=poll.col;
            int dis=poll.dis;
            if(row==m-1 && col==n-1) return dis;
            for(int d[]:dir){
                int nr=d[0]+row;
                int nc=d[1]+col;
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && !vis[nr][nc] && grid[nr][nc]!=1){
                    vis[nr][nc]=true;
                    pq.add(new Pair(nr,nc,dis+1));
                }
            }
        }
        return -1;
    }
}