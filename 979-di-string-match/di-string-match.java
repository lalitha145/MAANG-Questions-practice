class Solution {
    public int[] diStringMatch(String s) {
        int a[]=new int[s.length()+1];
        for(int i=0;i<a.length;i++){
            a[i]=i;
        }
        int res[]=new int[s.length()+1];
        int k=0;
        int i=0,j=a.length-1;
        for(char c: s.toCharArray()){
            if(c=='I'){
                res[k++]=a[i++];
            }else{
                res[k++]=a[j--];
            }
        }
         res[k]=a[i];
         return res;
    }
}