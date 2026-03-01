class Solution {
    public int shortestPath(int[][] grid, int k) {
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,k});
        boolean vis[][][]=new boolean[grid.length][grid[0].length][k+1];
        int level=0;
        vis[0][0][k]=true;
        int dir[][]={{-1,0},{0,-1}, {1,0},{0,1}};

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
            int poll[]= q.poll();
            int r=poll[0], c=poll[1];
            int remK=poll[2];
            if(r==grid.length-1 && c==grid[0].length-1) return level;
            for(int nb[]:dir){
                int nr=nb[0]+r;
                int nc=nb[1]+c;
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length){
                    int newK=remK-grid[nr][nc];
                    if(newK>=0 && !vis[nr][nc][newK]){
                        q.add(new int[]{nr,nc,newK});
                        vis[nr][nc][newK]=true;
                    }
                    
                }
            }
            }
            level++;
        }
        return -1;
    }
}