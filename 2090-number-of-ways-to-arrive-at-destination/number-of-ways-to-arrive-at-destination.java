class Pair{
    int node;
    long weight;
    public Pair(int node, long weight){
        this.node=node;
        this.weight=weight;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        int mod=1000000007;
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int r[]:roads){
            int u=r[0], v=r[1], w=r[2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.weight, b.weight));
        long ways[]=new long[n];
        long dist[]=new long[n];
        ways[0]=1;
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair poll=pq.poll();
            int currN=poll.node;
            long currW=poll.weight;
            for(Pair p:adj.get(currN)){
                int adjNode=p.node;
                long adjW=p.weight;
                if(dist[adjNode]>currW+adjW){
                    dist[adjNode]=currW+adjW;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                    ways[adjNode]=ways[currN];
                }else if(dist[adjNode]==currW+adjW){
                    ways[adjNode]=(ways[adjNode]+ways[currN])%mod;
                }
            }
        }
        return (int)ways[n-1];

    }
}