class Solution {
    public int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int count[]=new int[nums.length];
        int max=1;
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
            count[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    count[i]=count[j];
                }else if(dp[j]+1==dp[i]){
                    count[i]+=count[j];
                }
                }
            
            max=Math.max(dp[i],max);
        }
        
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(max==dp[i]){
                res+=count[i];
            }
        }
        return res;
    }
}