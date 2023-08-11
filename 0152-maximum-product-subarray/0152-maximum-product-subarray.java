class Solution {
	public int maxProduct(int[] nums) {
		int prefix=1;
        int suffix=1;
        int max=nums[0];
        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix=1;

            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
           
            max=Math.max(max,Math.max(prefix,suffix));
             

        }
        return max;
	}
}