class Solution {
  public int removeDuplicates(int[] nums) {
  int ind=1;
  int c=0;
  for(int i=1;i<nums.length;i++){
      if(nums[i-1]==nums[i]){
          c++;
      }else{
          c=0;
      }
      if(c<=1){
          nums[ind]=nums[i];
          ind++;
      }
  }
  return ind;
    }
}