class Solution {
    public int maxArea(int[] a) {
       int l=0;
       int r=a.length-1;
       int ans=0;
       while(l<r){
           int num=Math.min(a[l],a[r]);
           ans=Math.max(ans,num*(r-l));
           if(a[l]<a[r]){
               l++;
           }else{
               r--;
           }
       }
       return ans;
    }
}