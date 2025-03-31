class Pair{
    int row,col,diff;
    public Pair(int row,int col,int diff){
        this.row=row;
        this.col=col;
        this.diff=diff;
    }
}


class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int dis[][]=new int[m][n];
        for(int a[]:dis) Arrays.fill(a,Integer.MAX_VALUE);
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.diff-b.diff);
        pq.add(new Pair(0,0,0));
        while(!pq.isEmpty()){
            Pair poll=pq.poll();
            int r=poll.row;
            int c=poll.col;
            int d=poll.diff;
            if(r==m-1 && c==n-1) return d;
            for(int d1[]:dir){
                int nr=d1[0]+r;
                int nc=d1[1]+c;
                if(nr>=0 && nc>=0 && nr<m && nc<n){
                  int newDiff=Math.abs(heights[r][c]-heights[nr][nc]);
                  int effort=Math.max(newDiff,d);
                  if(dis[nr][nc]>effort){
                    dis[nr][nc]=newDiff;
                    pq.add(new Pair(nr,nc,effort));
                  }
                }

            }
        }
        return -1;
        
    }
}