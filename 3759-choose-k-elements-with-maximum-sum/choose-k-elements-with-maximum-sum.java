class Solution {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Integer[] sortedIndex=new Integer[nums1.length];
        long []ans=new long[nums1.length];
        for(int i=0;i<nums1.length;i++) sortedIndex[i]=i;
        Arrays.sort(sortedIndex,Comparator.comparingInt(i->nums1[i]));
        int j=0;
        long sum=0;
        for(int i=0;i<nums1.length;i++){
            int currInd=sortedIndex[i];
            while(j<i && nums1[sortedIndex[j]]<nums1[currInd]){
                pq.add(nums2[sortedIndex[j]]);
                sum+=nums2[sortedIndex[j]];
                if(pq.size()>k) sum-=pq.poll();
                j++;
            }
            if(pq.size()==0){
                ans[currInd]=0;
            }else{
              ans[currInd]=sum;
            }
        }
        return ans;
        
    }
}