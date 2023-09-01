class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
      System.out.println(map);
        for(int k1:map.keySet()){
            pq.add(new int[]{k1,map.get(k1)});
        }
       
        while(k>0){
           int p[]=pq.poll();
           p[1]=p[1]-1;
           if(p[1]!=0){
               pq.add(p);
           }
           k--;

           
        }

      //  System.out.println(map);

        return pq.size();


    }
}