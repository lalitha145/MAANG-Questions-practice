class Solution {
    public long minimumDifference(int[] nums) {
        long min=Long.MAX_VALUE;
        long sum=0;
        PriorityQueue<Long> maxPQ=new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<Long> minPQ=new PriorityQueue<>();

        long prefix[]=new long[nums.length];
        long suffix[]=new long[nums.length];
        long sum2=0;
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
           sum2+=(long)nums[nums.length-i-1];
           sum+=(long)nums[i];
           maxPQ.add((long)nums[i]);
           minPQ.add((long)nums[nums.length-i-1]);
          if(maxPQ.size()>n){
            sum-=maxPQ.poll();
          }
          if(minPQ.size()>n){
            sum2-=minPQ.poll();
          }
          if(minPQ.size()==n){
            suffix[nums.length-i-1]=sum2;
          }
          if(maxPQ.size()==n){
            prefix[i]=sum;
          }
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        for(int i=n-1;i<2*n;i++){
            min=Math.min(min,prefix[i]-suffix[i+1]);
        }
        return min;
    }
}