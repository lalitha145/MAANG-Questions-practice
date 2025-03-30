class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //topological sort will eventually remove all nodes that form cycle and the nodes that come towards cycle

        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> rev=new ArrayList<>();
        for(int i=0;i<graph.length;i++) rev.add(new ArrayList<>());
        int ind[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int nb:graph[i]){
                rev.get(nb).add(i);
                ind[i]++;
            }
        }
        for(int i=0;i<ind.length;i++){
            if(ind[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int nb:rev.get(node)){
                ind[nb]--;
                if(ind[nb]==0) q.add(nb);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}