class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,HashMap<String,Double>> map=buildMap(equations,values);
        double ans[]=new double[queries.size()];
        int ind=0;
        for(List<String> query:queries){
            String src=query.get(0);
            String dest=query.get(1);
            if(!map.containsKey(src) ||!map.containsKey(dest)) ans[ind++]=-1.0;
            else{
              HashSet<String> vis=new HashSet<>();
              double[] tempAns=new double[1];
              tempAns[0]=-1.0;
              double temp=1.0;
              dfs(vis,map,tempAns,temp,src,dest);
              ans[ind]=tempAns[0];
              ind++;
            }
        }
        return ans;

    }
    void dfs(HashSet<String> vis, HashMap<String,HashMap<String,Double>> map, double tempAns[], double temp, String src, String dest){
        vis.add(src);
        if(src.equals(dest)){
            tempAns[0]=temp;
            return;
        }
        for(Map.Entry<String,Double> entry:map.get(src).entrySet()){
           String nb=entry.getKey();
           double val=entry.getValue();
           if(!vis.contains(nb)){
            dfs(vis,map,tempAns,temp*val,nb,dest);
           }
        }
    }
    HashMap<String,HashMap<String,Double>> buildMap(List<List<String>> equations,double values[]){
        HashMap<String,HashMap<String,Double>> map=new HashMap<>();
        int i=0;
        for(List<String> list:equations){
            String divisor=list.get(0);
            String dividend=list.get(1);
            map.putIfAbsent(divisor,new HashMap<>());
            map.putIfAbsent(dividend,new HashMap<>());
            map.get(divisor).put(dividend,values[i]);
            map.get(dividend).put(divisor,1.0/values[i]);
            i++;
        }
        return map;
    }
}