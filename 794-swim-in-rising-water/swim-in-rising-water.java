class Pair{
    int row, col, value;
    public Pair(int row, int col, int value){
        this.row=row;
        this.col=col;
        this.value=value;
    }
}
class Solution {
    public int swimInWater(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.value-b.value);
        pq.add(new Pair(0,0,grid[0][0]));
        boolean vis[][]=new boolean[m][n];
        int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
        vis[0][0]=true;
        int max=0;
        while(!pq.isEmpty()){
            Pair poll=pq.poll();
            int row=poll.row;
            int col=poll.col;
            int value=poll.value;
            max=Math.max(max, value);
            if(row==m-1 && col==n-1) return Math.max(max, grid[row][col]);
            for(int d[]:dir){
                int nr=d[0]+row;
                int nc=d[1]+col;
                if(isValid(nr,nc,m,n) && !vis[nr][nc]){
                    pq.add(new Pair(nr,nc,grid[nr][nc]));
                    vis[nr][nc]=true;
                }
            }
        }
        return -1;
    }
    boolean isValid(int row, int col, int m, int n){
        return row>=0 && col>=0 && row<m && col<n;
    }
}