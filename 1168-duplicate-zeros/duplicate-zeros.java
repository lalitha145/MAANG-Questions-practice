class Solution {
    public void duplicateZeros(int[] arr) {
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++) temp[i]=arr[i];
        int i=0,j=0;
        while(j<arr.length){
            if(arr[i]==0 && j+1<arr.length){
                temp[j++]=0;

                temp[j++]=0;
                i++;
            }else{
                temp[j++]=arr[i];
                i++;
            }

        }
         for(int i1=0;i1<arr.length;i1++) arr[i1]=temp[i1];
    }
}