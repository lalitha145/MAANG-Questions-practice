class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Long,Integer> map=new HashMap<>();
        long sum=0;
        int ans=0;
        map.put((long)0,1);
        for(int i:nums){
          sum+=i;
          if(map.containsKey(sum-k)) ans+=map.get(sum-k);
          map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}