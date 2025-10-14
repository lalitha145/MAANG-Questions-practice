class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
       int requiredWindow=k-1;
       if(k==1) return true;
       for(int i=k+1;i<nums.size();i++){
        if(nums.get(i)>nums.get(i-1) && nums.get(i-k-1)<nums.get(i-k)){
            requiredWindow--;
        }else{
            requiredWindow=k-1;
        }
        if(requiredWindow==0) return true;
       }
       return false;
    }
}
