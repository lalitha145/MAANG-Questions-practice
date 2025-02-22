class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,HashMap<String,Double>> map=buildGraph(equations,values);
        double ans[]=new double[queries.size()];
        int ind=0;
        for(List<String> query:queries){
            String divisor=query.get(0);
            String dividend=query.get(1);
            if(!map.containsKey(divisor) ||!map.containsKey(dividend)){
                ans[ind]=-1.0;
            }else{
            HashSet<String> vis=new HashSet<>();
            double tempAns[]=new double[1];
            tempAns[0]=-1.0;
            double temp=1.0;
            dfs(map,divisor,dividend,tempAns,temp,vis);
            ans[ind]=tempAns[0];
            }
            ind++;
        }
        return ans;

    }
    void dfs(HashMap<String,HashMap<String,Double>> map,String source,String dest,double ans[],double temp,HashSet<String> vis){
        vis.add(source);
        if(source.equals(dest)){
            ans[0]=temp;
            return;
        }
        for(Map.Entry<String,Double> entry:map.get(source).entrySet()){
           String nb=entry.getKey();
           double val=entry.getValue();
           if(!vis.contains(nb)){
            dfs(map,nb,dest,ans,temp*val,vis);
           }
        }
    }
    HashMap<String,HashMap<String,Double>> buildGraph(List<List<String>> e, double[] v){
        HashMap<String,HashMap<String,Double>> map=new HashMap<>();
        int i=0;
        for(List<String> pair:e){
            String divisor=pair.get(0);
            String dividend=pair.get(1);
            if(!map.containsKey(divisor)){
                map.put(divisor,new HashMap<>());
            }
            if(!map.containsKey(dividend)){
                map.put(dividend,new HashMap<>());
            }
            map.get(divisor).put(dividend,v[i]);
            map.get(dividend).put(divisor,1.0/v[i]);
            i++;

        }
        return map;
    }
}