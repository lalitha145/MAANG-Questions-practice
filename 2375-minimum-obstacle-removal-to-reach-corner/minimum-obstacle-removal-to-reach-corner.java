class Solution {
    public int minimumObstacles(int[][] grid) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        vis[0][0]=true;
        pq.add(new int[]{0,0,0});
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        while(!pq.isEmpty()){
            int poll[]=pq.poll();
            int r=poll[0];
            int c=poll[1];
            int obs=poll[2];
            if(r==grid.length-1 && c==grid[0].length-1) return obs;
            for(int d[]:dir){
                int nr=d[0]+r,nc=d[1]+c;
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && !vis[nr][nc]){
                   vis[nr][nc]=true;
                   int newK=obs+grid[nr][nc];
                   pq.add(new int[]{nr,nc,newK});
                }
            }
        }
        return -1;
    }
}