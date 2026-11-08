class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                int j=i+1;
                for(int k=arr.length-1;k>=j;k--){
                    arr[k]=arr[k-1];
                }
               
                   arr[j]=0;
                   i++;
            }else{

            }
        }
    }
}