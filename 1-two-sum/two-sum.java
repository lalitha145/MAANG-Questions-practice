class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int length=nums.length;
      for(int index=0;index<length;index++){
        int complement=target-nums[index];
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),index};
        }
        map.put(nums[index],index);
      }
      return new int[]{-1,-1};
    }
}