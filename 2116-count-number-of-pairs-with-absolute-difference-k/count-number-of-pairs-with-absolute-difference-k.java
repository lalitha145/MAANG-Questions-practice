class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums.length-1;i>=0;i--){
            int c=k+nums[i];
            if(map.containsKey(c)){
                ans+=map.get(c);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return ans;
    }
}