class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int mod=1000000007;
        for(int i=0;i<nums.length;i++){
            int rev=helper(nums[i]);
            if(map.containsKey(nums[i]-rev)){
                ans+=map.get(nums[i]-rev);
                ans=ans%mod;
            }
            map.put(nums[i]-rev,map.getOrDefault(nums[i]-rev,0)+1);
        }
        return ans;
    }
    int helper(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        return sum;
    }
}