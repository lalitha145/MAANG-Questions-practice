class Solution {
    public int minimumEffortPath(int[][] heights) {
        int low=0;
        int high=Integer.MAX_VALUE;
        int m=heights.length,n=heights[0].length;
       // boolean vis[][]=new boolean[m][n];
        while(low<=high){
            int mid=(low+high)/2;
            boolean vis[][]=new boolean[m][n];
            
            if(dfs(mid,0,0,heights,vis)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    boolean dfs(int mid,int r,int c,int heights[][],boolean vis[][]){
        vis[r][c]=true;
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        if(r==heights.length-1 && c==heights[0].length-1) return true;
        for(int d[]:dir){
            int nr=d[0]+r;
            int nc=d[1]+c;
            if(nr>=0 && nc>=0 && nr<heights.length && nc<heights[0].length && !vis[nr][nc]){
                int newEffort=Math.abs(heights[r][c]-heights[nr][nc]);
                if(newEffort<=mid && dfs(mid,nr,nc,heights,vis)){
                
                return true;
            }
        }
        
    }
    return false;
    }
}