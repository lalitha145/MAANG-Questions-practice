class Solution {
    public long minCost(int[] nums) {
        long ans=(long)Long.MAX_VALUE;
        for(int i=1;i<nums.length-1;){
            //long pre=(long)i*(long)nums[i];
              int k=i-1;
            while(k>=0 && nums[i]==nums[k]){
                k--;
            }
            k++;
            long pre=(long)k*(long)nums[i];
            int j=i+1;
            while(j<nums.length && nums[i]==nums[j]){
                j++;
            }
           
            j--;
            long suff=(long)((long)(nums.length-j-1)*(long)nums[i]);
            i=j+1;
           
          
           
            System.out.println(pre+"  "+suff);
            ans=Math.min(ans,(long)pre+(long)suff);
        }
        return ans;
    }
}