class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
       if(nums.length==1) return nums[0];
        int ans=0;
        //pick 0
        dp[0]=nums[0];
        dp[1]=Math.max(dp[1],dp[0]);
        
        for(int i=2;i<nums.length-1;i++){
            int pick=nums[i]+dp[i-2];
            int np=dp[i-1];
            dp[i]=Math.max(pick,np);

        }
     
        ans=dp[nums.length-2];
        System.out.println(ans);

        Arrays.fill(dp,0);
        dp[0]=0;
        dp[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            int pick=nums[i]+dp[i-2];
            int np=dp[i-1];
            dp[i]=Math.max(pick,np);

        }
        

      return ans=Math.max(ans,dp[nums.length-1]);
    }
}