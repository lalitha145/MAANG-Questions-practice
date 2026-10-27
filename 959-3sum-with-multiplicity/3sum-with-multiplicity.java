class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int n=arr.length;
        int mod=1000000007;
        long cnt=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
           int j=i+1;
           int k=arr.length-1;
           while(j<k){
            int sum=arr[i]+arr[j]+arr[k];
            if(sum==target){
                if(arr[j]==arr[k]){
                    int m=k-j+1;
                    cnt += m * (m - 1) / 2;
                    break;
                }
                int lc=1, rc=1;
                while(j+1<k && arr[j]==arr[j+1]){
                    lc++;
                    j++;
                }
                while(k-1>j && arr[k]==arr[k-1]){
                    rc++;
                    k--;
                }
                cnt+=(long)(lc*rc);
                j++;
                k--;
            }else if(sum<target){
                j++;
            }else{
                k--;
            }
           }
        }
        return (int)(cnt%mod);
    }
}