class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
        Boolean dp[]=new Boolean[s.length()];
        return helper(set, 0, s,dp);
    }
    boolean helper(HashSet<String> set, int i, String s,Boolean dp[]){
        if(i>=s.length())  return true;
        if(dp[i]!=null) return dp[i];
        for(int j=i+1;j<=s.length();j++){
            String subStr=s.substring(i,j);
            System.out.println(subStr);
            if(set.contains(subStr)){
               
                if(helper(set,j,s,dp)){
                    dp[i]=true;
                    return true;
                  
                }
              
            }
        }
        dp[i]=false;
        return false;
    }
}