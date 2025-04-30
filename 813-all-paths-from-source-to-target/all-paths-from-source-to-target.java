class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean vis[]=new boolean[graph.length];
        vis[0]=true;
        path.add(0);
        dfs(paths,path,graph,vis,0,graph.length-1);
        return paths;
    }
    void dfs(List<List<Integer>> paths,List<Integer> path, int graph[][],boolean vis[],int src, int dest){
        if(src==dest){
            paths.add(new ArrayList<>(path));
            return;
        }
        
        for(int nb:graph[src]){
            if(!vis[nb]){
               path.add(nb);
               vis[nb]=true;
               dfs(paths,path,graph,vis,nb,dest);
               path.remove(path.size()-1);
               vis[nb]=false;

            }
        }

    }
}