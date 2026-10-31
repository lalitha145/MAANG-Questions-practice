class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            map.put(i,diff);
        }
        
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int diff=map.get(a)-map.get(b);
            if(diff==0) return arr[a]-arr[b];
            return diff;

        });
        // PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int i=0;i<arr.length;i++){
            pq.add(i);
        }
        while(!pq.isEmpty() && k>0){
            ans.add(arr[pq.poll()]);
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}