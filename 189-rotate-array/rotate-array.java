class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int temp[]=Arrays.copyOf(nums,nums.length);
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            temp[j++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            temp[j++]=nums[i];
        }
        System.out.println(Arrays.toString(temp));
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        // nums=Arrays.copyOf(temp,temp.length);
    }
}