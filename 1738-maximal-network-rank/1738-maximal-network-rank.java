class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int rank=0;
        int count[]=new int[n];
        int directlyConnected[][]=new int[n][n];
        for(int road[]:roads){
            count[road[0]]++;
            count[road[1]]++;
            directlyConnected[road[0]][road[1]]=1;
            directlyConnected[road[1]][road[0]]=1;


        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                rank=Math.max(rank,count[i]+count[j]-directlyConnected[i][j]);
            }
        }
        return rank;
    }
}