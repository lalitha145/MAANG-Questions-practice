class Solution {
    public int tupleSameProduct(int[] nums) {
      int ans=0;
    HashMap<Integer,Integer> m=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            m.put(nums[i]*nums[j],m.getOrDefault(nums[i]*nums[j],0)+1);
        }

    }
    for(int val:m.values()){
        ans+=(val)*(val-1)*4;
    }
    return ans;
    }
}