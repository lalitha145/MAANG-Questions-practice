class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       Arrays.sort(nums2);
       for(int ele:nums1){
        int ind=binarySearch(nums2,ele);
        if(ind!=-1) set.add(ele);
       } 
       int ans[]=new int[set.size()];
       int k=0;
       for(int ele:set){
        ans[k++]=ele;

       }
       return ans;
    }
    int binarySearch(int a[], int t){
        int l=0, h=a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==t){
                return m;
            }
            else if(a[m]>t){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return -1;
    }
}