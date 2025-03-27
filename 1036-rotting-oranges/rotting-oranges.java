class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int min=-1;
        boolean f=false;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    f=true;
                }
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(f==false) return 0;
        if(q.size()==0) return -1;
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
            int poll[]=q.poll();
            int r=poll[0],c=poll[1];

            for(int d[]:dir){
                int nr=r+d[0], nc=c+d[1];
                if(nr>=0 && nc>=0 && nr< grid.length && nc<grid[0].length && grid[nr][nc]==1){
                    q.add(new int[]{nr,nc});
                    grid[nr][nc]=2;
                }
            }
            }
            min++;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                // System.out.print(grid[i][j]+"  ");
                if(grid[i][j]==1) return -1;
            }
            System.out.println();
        }
        return min;
    }
}