class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean v[]=new boolean[arr.length];
     return helper(v,arr,start);

    }
    static boolean helper(boolean v[],int a[],int s){
       if(s<0 || s>=a.length || v[s]){
           return false;
       }
       if(a[s]==0){
           return true;
       }
       v[s]=true;
        boolean b1=helper(v,a,s+a[s]);
        boolean b2=helper(v,a,s-a[s]);
        return b1|| b2;
    }
}