class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int val=0;
        for(int k:map.keySet()){
            val+=map.get(k);
        }
        System.out.println(map);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
       for(int k:map.keySet()){
            pq.add(k);
            
        }
        int ans=0;
        while(!pq.isEmpty()){
            if(val<=arr.length/2){
                break;
            }
            val-=map.get(pq.poll());
            ans++;
          //  pq.poll();
        }
        
        System.out.println(pq);
        return ans;
    }
}