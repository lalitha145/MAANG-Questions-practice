class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        int k=0;
        for(int i=0;i<nums.length;){
            int j=i+1;
            while(j<nums.length && nums[j]==nums[i]){
                j++;
            }
            nums[k++]=nums[i];
            i=j;
            ans++;
        }
        return ans;
    }
}