class Solution {
        public List<Integer> pancakeSort(int[] A) {
        List<Integer> res = new ArrayList<>();
        for(int maxNumber=A.length;maxNumber>=1;maxNumber--){
            int maxIndex=findIndex(maxNumber,A);
            res.add(maxIndex+1);
            reverse(A, 0,maxIndex);
            res.add(maxNumber);
            reverse(A,0,maxNumber-1);
        }
        return res;
       
    }
    int findIndex(int n, int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]==n) return i;
        }
        return -1;
    }

    void reverse(int a[], int l, int h){
        while(l<h){
            int t=a[l];
            a[l]=a[h];
            a[h]=t;
            l++;
            h--;
        }
    }
}