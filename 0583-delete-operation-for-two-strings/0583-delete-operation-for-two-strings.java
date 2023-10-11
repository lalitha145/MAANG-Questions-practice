class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(dp,word1,word2,0,0);
    }
    static int helper(int dp[][],String s1,String s2,int i,int j){
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
      
        if(s1.charAt(i)==s2.charAt(j)){
            return helper(dp,s1,s2,i+1,j+1);
        }
       return dp[i][j]=Math.min(1+helper(dp,s1,s2,i,j+1),1+helper(dp,s1,s2,i+1,j));
    }
}