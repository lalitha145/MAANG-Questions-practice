class Solution {
    public int maximumCandies(int[] candies, long k) {
        long totalCandies=0;
        for(int i:candies){
            totalCandies+=i;
        }
        if(totalCandies<k){
          return 0;
        }
        long low=1;
        long high=Long.MIN_VALUE;
        for(int i:candies){
            high=Math.max(high,i);
        }
        while(low<=high){
            long mid=(low+high)/2;
            if(isPossible(mid,candies,k)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)high;
    }
    boolean isPossible(long mid,int nums[],long k){
        long cnt=0;
        for(int i:nums){
            cnt+=(i/mid);
        }
      //  System.out.println(mid+"  "+cnt);
        return cnt>=k;
    }
}