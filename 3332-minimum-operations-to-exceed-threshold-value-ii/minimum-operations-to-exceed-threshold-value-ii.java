class Solution {
    public int minOperations(int[] nums, int k) {
       PriorityQueue<Long> pq=new PriorityQueue<>();
       for(int ele:nums) pq.add((long)ele);
       int operations=0;
       while(pq.size()>=2 && pq.peek()<k){
        long firstMin=pq.poll();
        long secMin=pq.poll();
        long addEle=firstMin*2 +secMin;
        pq.add(addEle);
        operations++;
       }
       return operations;

    }
}