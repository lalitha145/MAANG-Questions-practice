class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int sum=Arrays.stream(nums).sum();
        if(sum==0) return 0;
        int low=1, high=queries.length;
        int ans=-1;
        if(!canMakeZero(nums,queries.length,queries)) return -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMakeZero(nums,mid,queries)){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean canMakeZero(int nums[],int k,int queries[][]){
      int diff[]=new int[nums.length+1];
      for(int i=0;i<k;i++){
        int left=queries[i][0],right=queries[i][1],value=queries[i][2];
        diff[left]+=value;
        diff[right+1]-=value;
      }
      int cnt=0;
      for(int i=0;i<nums.length;i++){
        cnt+=diff[i];
        if(cnt<nums[i]) return false;
      }
      return true;
    }
}