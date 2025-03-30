class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int ans[]=new int[numCourses];
        Stack<Integer> stack=new Stack<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        boolean vis[]=new boolean[numCourses];
        boolean path[]=new boolean[numCourses];
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                if(dfs(i,vis,adj,stack,path)) return new int[]{};
            }
        }
        int i=0;
        while(!stack.isEmpty()){
            ans[i++]=stack.pop();
        }
        return ans;

    }
    boolean dfs(int node,boolean vis[],List<List<Integer>> adj,Stack<Integer> stack,boolean path[]){
        vis[node]=true;
        path[node]=true;
        for(int nb:adj.get(node)){
            if(!vis[nb]){
                if(dfs(nb,vis,adj,stack,path))return true;
                
            }else if(path[nb]==true) return true;
        }
        stack.push(node);
        path[node]=false;
        return false;
    }
}