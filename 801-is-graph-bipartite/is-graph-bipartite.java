
class Pair{
    int node,color;
    public Pair(int node,int color){
        this.node=node;
        this.color=color;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        int colorNode[]=new int[graph.length];
        Arrays.fill(colorNode,-1);
        for(int i=0;i<graph.length;i++){
            if(colorNode[i]==-1){
              if(bfs(colorNode,i,graph)==false) return false;
            }
        }
        return true;
    }
    boolean bfs(int colorNode[],int node,int g[][]){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(node,0));
        while(!q.isEmpty()){
            Pair poll=q.poll();
            int currNode=poll.node;
            int currColor=poll.color;
            for(int neighbour:g[currNode]){
                if(colorNode[neighbour]==-1){
                    colorNode[neighbour]=1-currColor;
                    q.add(new Pair(neighbour,colorNode[neighbour]));
                }else if(colorNode[neighbour]==currColor) return false;
            }
        }
        return true;
       
    }
}