class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(char k:map.keySet()){
            pq.add(map.get(k));
        }
        int ans=0;
        while(!pq.isEmpty()){
            int poll=pq.poll();
            if(pq.size()==0){
                return ans;
            }
              
            if(pq.peek()==poll){
                if(poll>1){
              
                pq.add(poll-1);
                }
                ans++;
            
            }
              
        }
        return ans;
    }
}