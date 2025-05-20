class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
        List<String> ans=new ArrayList<>();
        List<String> valid=new ArrayList<>();
        helper(set,s,ans,valid,0);
        return ans;
    }
    void helper(HashSet<String> set, String s, List<String> ans, List<String> valid, int ind){
        if(ind>=s.length()){
            if(valid.size()>0){
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<valid.size();i++){
                    if(i>0){
                        sb.append(" ");
                    }
                    sb.append(valid.get(i));
                }
                ans.add(sb.toString());
            }
            return;
        }
        for(int j=ind+1;j<=s.length();j++){
            if(set.contains(s.substring(ind,j))){
                valid.add(s.substring(ind,j));
                helper(set,s,ans,valid,j);
                valid.remove(valid.size()-1);
            }
        }

    }
}