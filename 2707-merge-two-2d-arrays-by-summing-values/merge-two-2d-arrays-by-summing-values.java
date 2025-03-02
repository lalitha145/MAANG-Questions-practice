class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        //PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(int a[]:nums1){
            map.put(a[0],map.getOrDefault(a[0],0)+a[1]);
        }
        for(int a[]:nums2){
            map.put(a[0],map.getOrDefault(a[0],0)+a[1]);
        }
        int ans[][]=new int[map.size()][2];
        int i=0;
        for(int id:map.keySet()){
             ans[i++]=new int[]{id,map.get(id)};
        }
        
        return ans;
    }
}