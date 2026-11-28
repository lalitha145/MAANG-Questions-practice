class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        if(s.charAt(0)=='0') return 0;
        return helper(s,s.length()-1,dp);
    }
    int helper(String s, int i,int dp[]){
        if(i < 0) return 1;

        if(i == 0)
            return s.charAt(0) == '0' ? 0 : 1;

        
        if(dp[i]!=-1) return dp[i];
        int ans=0;
        if(s.charAt(i)!='0')
         ans=ans+helper(s,i-1,dp);
        if(i-1>=0){
            if(s.charAt(i-1)=='0') return ans;
            StringBuilder sb=new StringBuilder();
            sb.append(s.charAt(i-1)+""+s.charAt(i));
            int n=Integer.parseInt(sb.toString());
            System.out.println(n);
            if(n>=1 && n<=26){
                ans=ans+helper(s,i-2,dp);
            }
            
            }
            
       
       // return ans;
       
         
        return dp[i]=ans;
    }
}