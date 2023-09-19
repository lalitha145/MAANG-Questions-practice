class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] buckets = new boolean[n];
     
        for(int i=0;i<n;i++) {
           //System.out.println(Arrays.toString(buckets));
            if(buckets[nums[i]]) return nums[i];
            buckets[nums[i]] = true;
        }
        return 0;
    }
}