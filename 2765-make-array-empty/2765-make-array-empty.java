class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        long ans=nums.length;
        int m=0;
        for(int i=0;i<nums.length;i++){
            int original_pos=map.get(nums[i]);
            
             if(original_pos<m){
                ans+=(nums.length-i);
            }
            m=map.get(nums[i]);
        }
        return ans;
    }
}