class Solution {
    public String optimalDivision(int[] nums) {
      StringBuilder sb=new StringBuilder();
      if(nums.length==1){
          sb.append(nums[0]);
          return sb.toString();
      }
      if(nums.length==2){
      sb.append(nums[0]);
      sb.append("/");
      sb.append(nums[1]);
      return sb.toString();
      }
      sb.append(nums[0]);
      sb.append("/(");
      for(int i=1;i<nums.length;i++){
          sb.append(nums[i]).append("/");
      }
      sb.deleteCharAt(sb.length()-1);
      sb.append(")");
      return sb.toString();
    }
}