class Solution {
    public int[][] updateMatrix(int[][] mat) {
    Queue<int[]> q=new LinkedList<>();
    boolean vis[][]=new boolean[mat.length][mat[0].length];
    int m=mat.length;
    int n=mat[0].length;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==0){
                q.add(new int[]{i,j,1});
                vis[i][j]=true;
            }
        }
    }
    int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
    while(!q.isEmpty()){
        int poll[]=q.poll();
        int r=poll[0];
        int c=poll[1];
        int level=poll[2];
        for(int d[]:dir){
            int nr=d[0]+r;
            int nc=d[1]+c;
            if(nr>=0 && nc>=0 && nr<m && nc<n && !vis[nr][nc]){
                mat[nr][nc]=level;
                vis[nr][nc]=true;
                q.add(new int[]{nr,nc,level+1});
            }
        }
        
    }
    return mat;
    }
}