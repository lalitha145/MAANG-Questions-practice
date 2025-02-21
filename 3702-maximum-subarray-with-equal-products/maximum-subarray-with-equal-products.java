class Solution {
    public int maxLength(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long prod=nums[i];
            long gcdV=nums[i],lcmV=nums[i];
            for(int j=i+1;j<nums.length;j++){
              prod=prod*(long)nums[j];
              gcdV=gcd(gcdV,(long)nums[j]);
              lcmV=lcm(lcmV,(long)nums[j]);
              if(prod==gcdV*lcmV){
                ans=Math.max(ans,j-i+1);
              }
            }
        }
        return ans;
    }
    long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
    long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
}