class Solution {
    public int longestMountain(int[] arr) {
        int max=0;
        for(int i=1;i<arr.length-1;){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int j=i-1;
                int k=i+1;
                while(j-1>=0 && arr[j]>arr[j-1]){
                    j--;
                }
                while(k+1<arr.length && arr[k]>arr[k+1]){
                    k++;
                }
                max=Math.max(max, k-j+1);
                i=k+1;


            }else{
                i++;
            }
        }
        return max;
    }
}