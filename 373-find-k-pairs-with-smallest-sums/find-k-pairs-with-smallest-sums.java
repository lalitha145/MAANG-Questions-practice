class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> (b[0] + b[1]) - (a[0] + a[1]));
        List<List<Integer>> ans=new ArrayList<>();
        for(int i:nums1){
            for(int j:nums2){
                pq.offer(new int[]{i,j});
                if(pq.size()>k){
                    int sum=i+j;
                    int a[]=pq.poll();
                    if(sum>=a[0]+a[1]){
                        break;
                    }
                }
            }
        }
        
        while(!pq.isEmpty()){
            int a[]=pq.poll();
            ans.add(Arrays.asList(a[0],a[1]));
        }
        return ans;
    }
}