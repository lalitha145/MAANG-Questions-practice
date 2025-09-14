class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
       // int ans[]=new int[k];
        int ind=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:nums){
            if(!pq.contains(ele)) pq.add(ele);
        }
       // while(!pq.isEmpty()) System.out.println(pq.poll());
       int size=Math.min(k,pq.size());
       int ans[]=new int[size];
       while(!pq.isEmpty() && k>0){
        ans[ind++]=pq.poll();
        k--;
       }
        return ans;

    }
}