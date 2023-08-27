class Solution {
    public boolean exist(char[][] board, String word) {
        char c=word.charAt(0);
        boolean vis[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(c==board[i][j]){
                    if(helper(word,i,j,board,vis,0)){
                        return true;
                    }
                }
            }

        }
        return false;

    }
    static boolean helper(String word,int i,int j,char b[][],boolean v[][],int ind){
        if(ind==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=b.length || j>=b[0].length || v[i][j]){
            return false;
        }
        
        if(word.charAt(ind)==b[i][j] && !v[i][j]){
            v[i][j]=true;
            boolean b1=helper(word,i+1,j, b,v,ind+1);
            boolean b2=helper(word,i,j+1,b,v,ind+1);
            boolean b3=helper(word,i-1,j,b,v,ind+1);
            boolean b4=helper(word,i,j-1,b,v,ind+1);
            if(b1|b2|b3|b4){
                return true;
            }
            v[i][j]=false;

        }
        return false;

    }
}