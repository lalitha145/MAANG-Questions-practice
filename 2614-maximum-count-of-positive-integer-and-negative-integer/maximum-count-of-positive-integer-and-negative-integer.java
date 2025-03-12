class Solution {
    public int maximumCount(int[] nums) {
        int pos=firstIndexOfPos(nums);
        int neg=lastIndexOfNeg(nums);
         
        //  System.out.println(pos);
        //System.out.println(neg);
        return Math.max(nums.length-pos,neg+1);

    }
    int firstIndexOfPos(int nums[]){
      int low=0,high=nums.length-1;
      while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]<=0){
            low=mid+1;
        }else{
            high=mid-1;
        }
      }
       return low;
    }
    int lastIndexOfNeg(int nums[]){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=0){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
}
