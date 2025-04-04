class Pair{
    int row, col, value;
    public Pair(int row,int col, int value){
        this.row=row;
        this.col=col;
        this.value=value;
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.value-b.value);
        pq.add(new Pair(0,0,grid[0][0]));
        int m=grid.length, n=grid[0].length;
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        vis[0][0]=true;
        while(!pq.isEmpty()){
            Pair poll=pq.poll();
            int row=poll.row;
            int col=poll.col;
            int value=poll.value;

            if(row==m-1 && col==n-1) return value;
           
            if(row+1<m){
                if(!vis[row+1][col]){
                  pq.add(new Pair(row+1,col,value+grid[row+1][col]));
                  vis[row+1][col]=true;
                }

            }
           if(col+1<n){
            if(!vis[row][col+1]){
                pq.add(new Pair(row,col+1,value+grid[row][col+1]));
                vis[row][col+1]=true;
            }

            }
           

        }
        return -1;
    }
}