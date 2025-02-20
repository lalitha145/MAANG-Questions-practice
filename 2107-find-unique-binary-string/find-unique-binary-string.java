class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set=new HashSet<>();
        for(String s:nums) set.add(s);
        List<String> l=new LinkedList<>();
        helper(l,nums.length,0,"");
        for(String s:l){
            if(!set.contains(s)) return s;
        }
        return "";
     }
     void helper(List<String> l,int n,int ind,String temp){
        if(ind==n){
            l.add(temp);
            return;
        }
        helper(l,n,ind+1,temp+"0");
        helper(l,n,ind+1,temp+"1");
     }
}