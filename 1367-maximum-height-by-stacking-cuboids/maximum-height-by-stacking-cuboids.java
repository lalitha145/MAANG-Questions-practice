class Solution {
    public int solve(int idx,int[][] box,int[] dp){
        if(dp[idx]!=-1) return dp[idx];
        int ans=box[idx][2];
        for(int i=0; i<idx; i++){
            if(box[i][0]<=box[idx][0] && box[i][1]<=box[idx][1] && box[i][2]<=box[idx][2]){
                ans=Math.max(ans,box[idx][2]+solve(i,box,dp));
            }
        }
        System.out.println("answer "+ans);
        return dp[idx]=ans;
    }
    public int maxHeight(int[][] cuboids) {
        for (int[] c : cuboids) {
            Arrays.sort(c);
        }
        Arrays.sort(cuboids,(a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            if(a[1]!=b[1]) return a[1]-b[1];
            else return a[2]-b[2];
        });
        for(int a[]:cuboids){
            System.out.println(Arrays.toString(a));
        }
        int[] dp=new int[cuboids.length+1];
        Arrays.fill(dp,-1);
        int ans=0;
        for(int i=0; i<cuboids.length; i++){
            ans=Math.max(ans,solve(i,cuboids,dp));
        }
        return ans;
    }
}