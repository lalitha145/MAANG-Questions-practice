class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        if(s.charAt(0)=='0') return 0;
        return helper(s,0,dp);
    }
    int helper(String s, int i,int dp[]){
        if(i>=s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
        int ans=0;
        if(i+1<s.length()){
            if(s.charAt(i)=='0') return 0;
            String temp=s.substring(i,i+2);
            int n=Integer.parseInt(temp);
            if(n>=1 && n<=26) {
                ans=ans+helper(s,i+2,dp);
            }
            
        }
        ans=ans+helper(s,i+1,dp);
       // return ans;
       
         
        return dp[i]=ans;
    }
}