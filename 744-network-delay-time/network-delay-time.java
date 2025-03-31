class Pair{
    int node, w;
    public Pair(int node, int w){
        this.node=node;
        this.w=w;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int dist[]=new int[n+1];
        int ans=Integer.MIN_VALUE;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.add(new Pair(k,0));
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int t[]:times){
            int u=t[0], v=t[1], w=t[2];
            adj.get(u).add(new Pair(v,w));
        }
        while(!pq.isEmpty()){
           Pair poll=pq.poll();
           int node=poll.node;
           int w=poll.w;
           for(Pair p:adj.get(node)){
            int adjNode=p.node;
            int adjW=p.w;
            if(dist[adjNode]>adjW+w){
                dist[adjNode]=adjW+w;
                pq.add(new Pair(adjNode, dist[adjNode]));
            }
           }
        }
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }

}