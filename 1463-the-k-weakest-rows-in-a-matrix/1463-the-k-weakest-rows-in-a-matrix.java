class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[1]==b[1])?a[0]-b[0]:a[1]-b[1]);
       for(int i=0;i<mat.length;i++){
           int count=helper(mat[i]);
           pq.add(new int[]{i,count});

       }
       int res[]=new int[k];
       for(int i=0;i<k;i++){
           res[i]=pq.poll()[0];
       }
       return res;
    }
    static int helper(int a[]){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                c++;
            }
        }
        return c;
    }
}