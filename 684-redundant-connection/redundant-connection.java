class Solution {
    
    private boolean cycleExist(List<List<Integer>>adj, int V, int src){
        boolean visited[] = new boolean[V+1];
        
        return cycleUtil(adj, V, visited, src, -1);
    }
    
    private boolean cycleUtil(List<List<Integer>>adj, int V, boolean visited[] ,  int node, int par){
        visited[node] = true;
        
        for(int nei: adj.get(node)){
            if(!visited[nei]) {
                if(cycleUtil(adj, V, visited, nei, node))
                    return true;
            } else {
                if(nei!=par){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>>adj = new ArrayList<>();
        
        int arr[] = null;
        
        int V = edges.length;
        
        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int edge[] : edges){
            int src = edge[0];
            int dest = edge[1];
            

            adj.get(src).add(dest);
            adj.get(dest).add(src);

            if(cycleExist(adj, V, src))
                return edge;
        }
        
        return arr;
    }
}