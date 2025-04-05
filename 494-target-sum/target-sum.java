class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
       HashMap<String,Integer> map=new HashMap<>();
        return helper(nums, target, sum, nums.length - 1,map);
    }

    int helper(int[] nums, int target, int sum, int ind,HashMap<String,Integer> map) {
        if (ind < 0) {
            return sum == target ? 1 : 0;
        }
        String key=sum+","+ind;
        if(map.containsKey(key)) return map.get(key);
        int ch1 = helper(nums, target, sum - nums[ind], ind - 1,map);
        int ch2 = helper(nums, target, sum + nums[ind], ind - 1,map);

        map.put(key,ch1 + ch2);
        return ch1+ch2;
    }
}
