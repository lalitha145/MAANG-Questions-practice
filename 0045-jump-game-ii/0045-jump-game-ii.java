class Solution {
    public int jump(int[] nums) {
        int f=0;
        int j=0;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            f=Math.max(f,i+nums[i]);
            if(ind>=nums.length-1){
                break;
            }
            if(ind==i){
                j++;
                ind=f;
            }

        }
        return j;
    }
}