class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int p[]:prerequisites){
            adj.get(p[0]).add(p[1]);
        }
        for(int i=0;i<numCourses;i++){
            boolean vis[]=new boolean[numCourses];
            boolean path[]=new boolean[numCourses];
            if(isCycle(i, adj, vis,path)) return false;
        }
        return true;
    }
    boolean isCycle(int node, List<List<Integer>> adj, boolean vis[],boolean path[]){
       vis[node]=true;
       path[node]=true;
       for(int nb:adj.get(node)){
         if(!vis[nb]){
             if(isCycle(nb,adj,vis, path)) return true;
         }else if(path[nb]) return true;
        
       }
       path[node]=false;
       return false;
    }
}