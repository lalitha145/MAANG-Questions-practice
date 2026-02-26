class Pair {
    int row, col, step;
    public Pair(int row, int col, int step){
        this.row=row;
        this.col=col;
        this.step=step;
    }
}

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] vis = new boolean[n][n];
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.step - b.step);
        pq.offer(new Pair(0,0, grid[0][0]));
        vis[0][0] = true;

        while(!pq.isEmpty()){
            Pair cur = pq.poll();
            int r = cur.row, c = cur.col, step = cur.step;

            if(r == n-1 && c == n-1) return step;

            for(int[] d : dirs){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr>=0 && nc>=0 && nr<n && nc<n && !vis[nr][nc]){
                    vis[nr][nc] = true;
                    pq.offer(new Pair(nr, nc, Math.max(step, grid[nr][nc])));
                }
            }
        }
        return -1;
    }
}
