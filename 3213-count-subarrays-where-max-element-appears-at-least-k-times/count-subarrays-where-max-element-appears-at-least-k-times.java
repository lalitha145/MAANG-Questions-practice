class Solution {
    public long countSubarrays(int[] nums, int k) {
       long ans=0;
       HashMap<Integer,Integer>map=new HashMap<>();
       int left=0;
       int max=Integer.MIN_VALUE;
       for(int ele:nums){
        max=Math.max(max,ele);
       }
       for(int right=0;right<nums.length;right++){
        map.put(nums[right],map.getOrDefault(nums[right],0)+1);
        while(map.containsKey(max) && map.get(max)>=k){
            map.put(nums[left],map.get(nums[left])-1);
            if(map.get(nums[left])==0) map.remove(nums[left]);
            left++;
        }
        ans+=(left);
       }
       return ans;
    }
}