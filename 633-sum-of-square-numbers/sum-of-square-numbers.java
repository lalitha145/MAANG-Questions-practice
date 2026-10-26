class Solution {
    public boolean judgeSquareSum(int target) {
        if(target==1) return true;
         int left=0;    
         long right=(long)Math.sqrt(target);

        while(left<=right){
            long sum=(left*left + right*right);
            if(left*left+ right*right ==target) return true;
            else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}