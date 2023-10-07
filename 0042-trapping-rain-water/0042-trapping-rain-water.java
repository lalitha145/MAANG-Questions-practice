class Solution {
    public int trap(int[] a) {
        int ans=0;
        for(int i=1;i<a.length;i++){
          int l=i-1;
          int r=i+1;
          int leftmax=0;
          int rightmax=0;
          while(l>=0){
              leftmax=Math.max(a[l],leftmax);
              l--;

          }
           while(r<a.length){
              rightmax=Math.max(a[r],rightmax);
              r++;

          }
          if(leftmax<=a[i] ||rightmax<=a[i]){
           continue;

          }else{
        ans=ans+(Math.min(leftmax,rightmax)-a[i]);
          }

        }
        return ans;
        
    }
}