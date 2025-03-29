class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean vis[][]=new boolean[m][n];
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==m-1 || j==0 || j==n-1){
                    if(board[i][j]=='O'){
                        dfs(vis,i,j,board,dir);
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    void dfs(boolean vis[][],int i,int j,char b[][],int dir[][]){
        if(i<0 || j<0 || i>=b.length || j>=b[0].length || vis[i][j] || b[i][j]=='X') return;
        vis[i][j]=true;
        for(int d[]:dir){
            int nr=d[0]+i;
            int nc=d[1]+j;
            dfs(vis,nr,nc,b,dir);
        }

    }
}