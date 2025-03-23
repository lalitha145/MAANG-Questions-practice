class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(n,0,0,ans,"");
        return ans;


    }
    void helper(int n,int c,int o,List<String> ans,String temp){
        if(o>n|| c>n) return;
        if(o==n && c==n) {
            ans.add(temp);
            return;
        }
        helper(n,c,o+1,ans,temp+"(");
        if(o>c){
            helper(n,c+1,o,ans,temp+")");
        }
    }
}