class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
       HashMap<Integer, List<int[]>> adj=new HashMap<>();
       for(int time[]:times){
            adj.computeIfAbsent(time[0],k1->new ArrayList<>()).add(new int[]{time[1], time[2]});
       }
       Queue<int[]> q=new LinkedList<>();
       q.add(new int[]{k,0});
       int dis[]=new int[n+1];
    
       Arrays.fill(dis, Integer.MAX_VALUE);
               int cnt=0;
        dis[k]=0;

       while(!q.isEmpty()){
        int  poll[]=q.poll();
        int node=poll[0];
        int disSoFar=poll[1];
        if(adj.get(node)==null) continue;
        for(int a[]:adj.get(node)){
            int adjDis=a[1];
            int adjNode=a[0];
            if(dis[adjNode]> adjDis+disSoFar){
                dis[adjNode]=adjDis+disSoFar;
                q.add(new int[]{adjNode, adjDis+disSoFar});

                cnt++;
            }
        }

       }
       int max=Integer.MIN_VALUE;
        for(int i=1;i<dis.length;i++){
            max=Math.max(max, dis[i]);
        }
       return max==Integer.MAX_VALUE?-1: max;
       
    }
}