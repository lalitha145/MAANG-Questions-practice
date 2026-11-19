class Solution {
    public int maxEnvelopes(int[][] e) {
    Arrays.sort(e,(a,b)->(a[0]==b[0]?b[1]-a[1]:a[0]-b[0]));
    int dp[]=new int[e.length];
    int len=0;
    for(int e1[]:e){
        int ind=helper(0,len,e1[1],dp);
       dp[ind]=e1[1];
        if(ind==len){
           
            len++;
        }

    }
    return len;
    }
    int helper(int s,int e,int t,int dp[]){
        e=e-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(dp[mid]>=t){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}