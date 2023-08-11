class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> ans=new ArrayList<>();
      helper(ans,n,0,0,"");
      return ans;
    }
    static void helper(List<String> ans,int n,int open,int close,String s){
        if(open==n && close==n){
            ans.add(s);
        }
        if(open<n){
            helper(ans,n,open+1,close,s+'(');
        }
        if(close<open){
            helper(ans,n,open,close+1,s+')');
        }
    }
    
}