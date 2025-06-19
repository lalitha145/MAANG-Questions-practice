class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i=1;
        int j=0;
        int cnt=0;
        while(i<nums.length){
            if(nums[i]-nums[j]<=k){
                i++;
            }else{
                j=i;
                cnt++;
                i++;
            }
        }
        return cnt+1;
    }
}