class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[]=new int[queries.length];
        int ind=0;
        for(int query[]:queries){
            int cnt=0;
            int x1=query[0];
            int y1=query[1];
            int r=query[2];

            for(int point[]:points){
                int x=point[0];
                int y=point[1];
                int dx=(x1-x)*(x1-x);
                int dy=(y1-y)*(y1-y);
                int d=(dx+dy);
                if(d<=r*r) cnt++;


            }
            ans[ind++]=cnt;
        }
        return ans;
    }
}