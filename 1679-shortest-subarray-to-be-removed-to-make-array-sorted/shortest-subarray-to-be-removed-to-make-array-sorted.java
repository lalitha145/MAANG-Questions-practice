class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int left=0, right=arr.length-1;
        int ans=arr.length;
        while(left+1<arr.length && arr[left]<=arr[left+1]) left++;
        while(right-1>=0 && arr[right]>=arr[right-1]) right--;
        if(left>=right) return 0;
        ans=Math.min(arr.length-(left+1), right);
        for(int i=0;i<=left;i++){
            int j=binarySearch(arr,right,arr.length-1,arr[i]);
            ans=Math.min(ans, j-(i+1));
        }
        return ans;

    }
    int binarySearch(int a[], int low, int high, int target){
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}