class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor=image[sr][sc];
        Queue<int[]> q=new LinkedList<>();
        boolean vis[][]=new boolean[image.length][image[0].length];
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        q.add(new int[]{sr,sc});
        vis[sr][sc]=true;
        image[sr][sc]=color;
        while(!q.isEmpty()){
           int poll[]=q.poll();
           int r=poll[0], c=poll[1];
           for(int d[]:dir){
            int nr=r+d[0];
            int nc=c+d[1];
            if(nr>=0 && nc>=0 && nr<image.length && nc<image[0].length && image[nr][nc]==startColor && !vis[nr][nc] ){
                vis[nr][nc]=true;
                image[nr][nc]=color;
                q.add(new int[]{nr,nc});
            }
           }
        }
        return image;
    }
}