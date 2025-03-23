class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(ans,new ArrayList<>(),0,s);
        return ans;
    }
    void helper(List<List<String>> ans,List<String> l,int i,String s){
        if(i>s.length()) return;
        if(i==s.length()) {
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j=i;j<s.length();j++){
            String temp=s.substring(i,j+1);
            if(new StringBuilder(temp).reverse().toString().equals(temp)){
                l.add(temp);
                helper(ans,l,j+1,s);
                l.remove(l.size()-1);
            }
        }
    }
}