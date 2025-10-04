class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long ans=0;
        HashMap<Double,Integer> map=new HashMap<>();
        for(int rec[]:rectangles){
            double d=rec[0]/(double)rec[1];
            if(map.containsKey(d)) ans+= map.get(d);
            map.put(d,map.getOrDefault(d,0)+1);
        }
        return ans;
    }
}