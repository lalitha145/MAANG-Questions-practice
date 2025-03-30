class Solution {
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int color[]=new int[v];
        Arrays.fill(color,-1);
        for(int i=0;i<v;i++){
           if(color[i]==-1){
            if(dfs(color,i,graph,0)==false) return false;
           }
        }
        return true;
    }
    boolean dfs(int color[],int node,int g[][],int nodeColor){
        color[node]=nodeColor;
        for(int nb:g[node]){
            if(color[nb]==-1){
                color[nb]=1-nodeColor;
                if(dfs(color,nb,g,color[nb])==false) return false;
                
            }else if(color[nb]==nodeColor) return false;
        }
        return true;
    }
}