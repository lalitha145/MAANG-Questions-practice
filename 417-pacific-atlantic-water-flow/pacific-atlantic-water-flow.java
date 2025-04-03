class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
         List<List<Integer>> ans=new ArrayList<>();
         int m=heights.length, n=heights[0].length;
         boolean pac[][]=new boolean[m][n];
         boolean atl[][]=new boolean[m][n];
        for(int row=0;row<m;row++){
             dfs(row,0,heights,0,m,n,pac);
        }
        for(int col=0;col<n;col++){
            dfs(0,col,heights,0,m,n,pac);
        }
        for(boolean a[]:pac){
        System.out.println(Arrays.toString(a));
        }
        for(int col=0;col<n;col++){
            dfs(m-1,col,heights,0,m,n,atl);

        }
        for(int row=0;row<m;row++){
            dfs(row,n-1,heights,0,m,n,atl);
        }
       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pac[i][j] && atl[i][j]) {
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
       return ans;          
    }
    void dfs(int i, int j, int h[][],int pre, int m, int n, boolean vis[][]){
        if(i<0 || j<0 || i>=m || j>= n || vis[i][j]) return;
        if(h[i][j]<pre) return;

        vis[i][j]=true;
        dfs(i+1,j,h,h[i][j],m,n,vis);
        dfs(i-1,j,h,h[i][j],m,n,vis);
        dfs(i,j-1,h,h[i][j],m,n,vis);
        dfs(i,j+1,h,h[i][j],m,n,vis);


    }
}