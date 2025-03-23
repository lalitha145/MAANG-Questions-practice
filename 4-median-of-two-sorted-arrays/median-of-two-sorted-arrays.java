class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
                int nextEle=-1;
                if(nums1[i]<=nums2[j]){
                nextEle=nums1[i];
                i++;
                }else{
                    nextEle=nums2[j];
                    j++;
                }
                min.add(nextEle);
                if(min.size()>max.size()){
                    max.add(min.poll());
                }
        }
       while(i<nums1.length){
        min.add(nums1[i++]);
        if(min.size()>max.size()){
            max.add(min.poll());
        }
       }
       while(j<nums2.length){
        min.add(nums2[j++]);
        if(min.size()>max.size()){
        max.add(min.poll());
        }
       }
       
       if(min.size()<max.size()) return (double)max.poll();
       else return (double)(min.poll()+max.poll())/2.0;
       
    }
}