class Solution {
    public int[][] merge(int[][] i) {
        Arrays.sort(i,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        int start=i[0][0];
        int end=i[0][1];
        for(int a[]: i){
            int nstart=a[0];
            int nend=a[1];
            if(nstart<=end){
                end=Math.max(end,nend);
            }
            else{
               ans.add(new int[]{start, end});
               start=nstart;
               end=nend;
            }
        }
        ans.add(new int[]{start, end});
        return ans.toArray(new int[0][]);

    }
}