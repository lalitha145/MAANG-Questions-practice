class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if(i==j){
                    continue;
                }
                int dis=helper(points[i],points[j]);
                map.put(dis,map.getOrDefault(dis,0)+1);
            }
            for(int k:map.keySet()){
                if(map.get(k)>=2){
                ans+=map.get(k)*(map.get(k)-1);
                }
            }
            map.clear();
        }
        return ans;
    }
    static int helper(int p1[],int p2[]){
        int a=p2[0]-p1[0];
        int b=p2[1]-p1[1];
        return a*a+ b*b;
    }
}