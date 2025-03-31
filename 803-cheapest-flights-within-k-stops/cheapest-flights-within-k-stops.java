class Pair{
    int node,cost;
    public Pair(int node,int cost){
        this.node=node;
        this.cost=cost;
    }
}
class Tuple{
    int node, cost, K;
    public Tuple(int node,int cost,int K){
        this.node=node;
        this.cost=cost;
        this.K=K;
    }
}
 class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj=new ArrayList<>();
       Queue<Tuple> pq=new LinkedList<>();
        int dist[]=new int[n];
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int f[]:flights){
            int u=f[0],v=f[1], w=f[2];
            adj.get(u).add(new Pair(v,w));
        }
        // node. cost, k
        pq.add(new Tuple(src,0,0));
        while(!pq.isEmpty()){
            Tuple t=pq.poll();
            int currNode=t.node;
            int currCost=t.cost;
            int currK=t.K;
            // if(currNode==dst){
            //     return currCost;
            // }
            if(currK>k) continue;
            for(Pair p:adj.get(currNode)){
                int adjNode=p.node;
                int adjCost=p.cost;
                if(adjCost+currCost<dist[adjNode] && currK<=k){
                    dist[adjNode]=adjCost+currCost;
                    pq.add(new Tuple(adjNode,dist[adjNode],currK+1));
                }
            }
        }
       return dist[dst]==Integer.MAX_VALUE? -1: dist[dst];


      
    }
}