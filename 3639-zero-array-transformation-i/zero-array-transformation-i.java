class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
       int pre[]=new int[nums.length+1];
       for(int query[]:queries){
           int l=query[0];
           int r=query[1];
           pre[l]+=1;
           pre[r+1]+=-1;

       }
       System.out.println(Arrays.toString(pre));
       int preSum=0;
       for(int i=0;i<nums.length;i++){
        preSum+=pre[i];
        if(nums[i]-preSum>0) return false;
        
       }
       return true;
     


    }
}