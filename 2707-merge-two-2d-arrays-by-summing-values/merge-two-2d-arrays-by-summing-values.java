class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int a[]:nums1){
            map.put(a[0],map.getOrDefault(a[0],0)+a[1]);
        }
        for(int a[]:nums2){
            map.put(a[0],map.getOrDefault(a[0],0)+a[1]);
        }
        for(int id:map.keySet()){
            pq.add(new int[]{id,map.get(id)});
        }
        int ans[][]=new int[pq.size()][2];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll();
        }
        return ans;
    }
}