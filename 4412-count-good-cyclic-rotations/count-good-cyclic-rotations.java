class Solution {
    public int countGoodRotations(int[] nums) {
        long left=0, right=0;
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n/2;i++){
            left+=nums[i];
        }
        for(int i=n/2;i<n;i++){
            right+=nums[i];
        }
        if(left>right) cnt++;
         
        for(int i=0;i<nums.length-1;i++){
        
            left-=nums[i];
            left+=nums[(n/2+i)%n];
            right-=nums[(n/2+i)%n];
            right+=nums[i];
            if(left>right) cnt++;

            
        }

return cnt;


    }
}