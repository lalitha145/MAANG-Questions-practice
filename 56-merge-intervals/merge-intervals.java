class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        int start=a[0][0];
        int end=a[0][1];
        List<int[]> ans=new ArrayList<>();
        for(int i=1;i<a.length;i++){
            if(a[i][0]<=end){
                end=Math.max(end,a[i][1]);
            }else{
                ans.add(new int[]{start,end});
                start=a[i][0];
                end=a[i][1];
            }
        }
         ans.add(new int[]{start,end});
         return ans.toArray(new int[0][]);

    }
}