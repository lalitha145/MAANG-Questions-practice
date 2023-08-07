class Solution {
    public int arraySign(int[] nums) {
        int ans=1;
        for(int i:nums){
            if(i==0){
                return 0;
            }
            ans=ans*i;

            if(ans>0){
                ans=1;
            }else{
                ans=-1;
            }
        }
        return ans;

    }
}