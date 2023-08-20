class Solution {
    public int findCenter(int[][] edges) {
        int a[]=new int[100001];
        for(int i[]:edges){
            a[i[0]]++;
            a[i[1]]++;
        }
        System.out.println(Arrays.toString(a));
        int ans=0;
        for(int i=1;i<a.length;i++){
            if(a[i]==edges.length){
               return i;
            }
        }
        return ans;
    }
}