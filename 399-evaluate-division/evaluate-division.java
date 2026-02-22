class Pair{
    String node;
    double val;
    public Pair(String node, double val){
        this.node=node;
        this.val=val;
    }
}
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,List<Pair>> adj=new HashMap<>();
        double ans[]=new double[queries.size()];
        for(int i=0;i<equations.size();i++){
          String from=equations.get(i).get(0);
          String to=equations.get(i).get(1);
          double val=values[i];
          adj.computeIfAbsent(from, k->new ArrayList<>()).add(new Pair(to,val));
          adj.computeIfAbsent(to, k->new ArrayList<>()).add(new Pair(from,1.0/val));
        }
        int i=0;
        for(List<String> query:queries){
            String from=query.get(0);
            String to=query.get(1);
            double temp[]=new double[]{1.0};
            if(!adj.containsKey(from) || !adj.containsKey(to)) {
            ans[i]=-1.0;
            }
            else {
                HashSet<String> vis=new HashSet<>();
                boolean found=dfs(adj, query.get(0), query.get(1), temp, vis);

                ans[i]=found?temp[0]:-1.0;
            }
            i++;
        }
        return ans;
    }
    boolean dfs(HashMap<String,List<Pair>> adj,
            String from, String to,
            double[] temp,
            HashSet<String> vis) {

    if (from.equals(to)) return true;

    vis.add(from);

    for (Pair p : adj.get(from)) {
        if (!vis.contains(p.node)) {
            double prev = temp[0];
            temp[0] *= p.val;

            if (dfs(adj, p.node, to, temp, vis)) {
                return true; 
            }

            temp[0] = prev; 
        }
    }
    return false;
}
}

