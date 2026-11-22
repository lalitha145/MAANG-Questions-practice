class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int ele:weights){
            low=Math.max(low,ele);
            high+=ele;
        }
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int d=helper(weights,mid);
            if(d<=days){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }

        }
        return ans;

    }
    int helper(int a[], int w){
        int cnt=1;
        int sum=0;
        for(int ele:a){
            sum+=ele;
            if(sum>w){
                cnt++;
                sum=ele;
            }
        }
        return cnt;
    }
}