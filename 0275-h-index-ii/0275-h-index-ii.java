class Solution {
    public int hIndex(int[] c) {
        
        int n=c.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(c[mid]==n-mid){
                ans=n-mid;
                return ans;
                
            }else if(c[mid]<n-mid){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return n-low;
    }
}