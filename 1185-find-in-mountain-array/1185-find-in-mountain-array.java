/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int p=helper1(mountainArr);
        int ans=bs1(mountainArr,0,p,target);
       if(ans!=-1){
           return ans;
       }
      ans=bs2(mountainArr,p,n-1,target);
      return ans;

       
       
    }
    static int helper1(MountainArray m){
        int l=0;
        int h=m.length()-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(m.get(mid)>m.get(mid+1)){
                
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
        
    }
    static int bs1(MountainArray m,int l,int h,int t){
      while(l<=h){
          int mid=(l+h)/2;
          if(m.get(mid)==t){
              return mid;
          }else if(m.get(mid)>t){
              h=mid-1;
          }else{
              l=mid+1;
          }
      }
      return -1;
    }
    static int bs2(MountainArray m,int l,int h,int t){
      while(l<=h){
          int mid=(l+h)/2;
          if(m.get(mid)==t){
              return mid;
          }else if(m.get(mid)>t){
            l=mid+1;
          }else{
              h=mid-1;
          }
      }
      return -1;
    }
}