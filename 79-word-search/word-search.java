class Solution {
    public boolean exist(char[][] board, String word) {
        boolean vis[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(i,j,board,word,vis, 0)){
                        return true;
                    }
                }
            }

        }
        return false;
    }
    boolean dfs(int i,int j,char b[][],String word,boolean vis[][],int wInd){
       if(wInd==word.length()) return true;
      if(i<0 || j<0 || i>=b.length || j>=b[0].length || vis[i][j]) return false;

       boolean ans=false;
       int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
       if(word.charAt(wInd)==b[i][j]){
        vis[i][j]=true;
        for(int d[]:dir){
            int nr=d[0]+i;
            int nc=d[1]+j;
            ans=ans || dfs(nr,nc,b,word,vis,wInd+1);
           
        }
        vis[i][j]=false;
       }
       return ans;
    }
}