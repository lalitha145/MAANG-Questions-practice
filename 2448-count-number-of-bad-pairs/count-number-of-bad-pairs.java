class Solution {
   public long countBadPairs(int[] nums) {
    long cnt=0;
    int n=nums.length;
    //cnt=(long)((n)*(n-1)/2);
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int prev=map.getOrDefault((i-nums[i]),0);
        cnt=cnt+i-prev;
        map.put(i-nums[i],prev+1);
    }
    return cnt;
}
}