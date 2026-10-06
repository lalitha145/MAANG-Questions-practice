class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        long right[]=new long[n];
        long left[]=new long[n];
        Arrays.fill(left,1);
        Arrays.fill(right,1);

        long max=Integer.MIN_VALUE;
        left[0]=nums[0];
        right[n-1]=nums[n-1];
        for(int i=1;i<nums.length;i++){
           left[i]=left[i-1]*nums[i];
            if(left[i]==0){
                left[i]=nums[i];
            }
        }
        for(int j=n-2;j>=0;j--){
            right[j]=right[j+1]*nums[j];
            if(right[j]==0){
                right[j]=nums[j];
            }
        }
        System.out.println(Arrays.toString(left));
        for(int i=0;i<n;i++){
            max=Math.max(max,Math.max(left[i],right[i]));
        }
        return (int)max;
    
    }
}