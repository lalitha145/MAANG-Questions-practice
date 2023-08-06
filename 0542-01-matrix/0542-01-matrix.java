class Pair{
    int f;int s;
    public Pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q=new LinkedList<>();
        
        int m=mat.length;
        int n=mat[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j));
                    vis[i][j]=true;
                }
            }
        }
        int dis=1;
        while(!q.isEmpty()){
            int size=q.size();
             
            for(int i=0;i<size;i++){
                int f=q.peek().f;
               int s=q.peek().s;
               q.poll();

                int row[]={-1,0,+1,0};
                int col[]={0,+1,0,-1};
                for(int j=0;j<4;j++){
                    int nr=f+row[j];
                    int nc=s+col[j];
                    if(nr>=0 && nc>=0 && nr<m && nc<n && !vis[nr][nc]){
                        q.add(new Pair(nr,nc));
                        vis[nr][nc]=true;
                        mat[nr][nc]=dis;
                    }
                }
                
            }
            dis++;
        }
        return mat;
    }
}