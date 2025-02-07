class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> colorSet=new HashMap<>();
        int i=0;
        int res[]=new int[queries.length];
        for(int query[]:queries){
            int ball=query[0];
            int color=query[1];
            if(map.containsKey(ball)){
                int existingColor=map.get(ball);
                
                colorSet.put(existingColor,colorSet.get(existingColor)-1);
                if(colorSet.get(existingColor)==0) colorSet.remove(existingColor);
                colorSet.put(color,colorSet.getOrDefault(color,0)+1);
                map.put(ball,color);
                
            }else{
                colorSet.put(color,colorSet.getOrDefault(color,0)+1);
                map.put(ball,color);
            }
           
            res[i++]=colorSet.size();
        }
        return res;
        
    }
}