class Pair{
    int adjNode;
    int cost;
    public Pair(int adjNode, int cost){
        this.adjNode=adjNode;
        this.cost=cost;
    }

}
class Tuple {
    int node, cost, stops;
    public Tuple(int node, int cost, int stops) {
        this.node = node;
        this.cost = cost;
        this.stops = stops;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int f[]:flights){
            adj.get(f[0]).add(new Pair(f[1], f[2]));
        }
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<Tuple> pq=new LinkedList<>();
        pq.add(new Tuple(src,0,0));
        int ans=Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            Tuple t=pq.poll();
            int node=t.node;
            int cost=t.cost;
            int stops=t.stops;
            if(node==dst){
                ans=Math.min(ans,cost);
            }
            if(stops>k) continue;
            
            for(Pair p:adj.get(node)){
                int adjNode=p.adjNode;
                int adjCost=p.cost;
                if(dist[adjNode]>adjCost+cost && stops<=k){
                    dist[adjNode]=adjCost+cost;
                    pq.add(new Tuple(adjNode, dist[adjNode], stops+1));
                }
               
            }
           
        }
        return dist[dst]==Integer.MAX_VALUE?-1:ans;

    }
}