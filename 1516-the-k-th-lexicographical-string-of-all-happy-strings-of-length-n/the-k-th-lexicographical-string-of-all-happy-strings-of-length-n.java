class Solution {
    public String getHappyString(int n, int k) {
        Queue<String> q=new LinkedList<>();
        List<String> ans=new ArrayList<>();
        q.add("a");
        q.add("b");
        q.add("c");
        while(!q.isEmpty()){
            String s=q.poll();
            if(s.length()==n){
                ans.add(s);
                continue;
            }
            for(char ch:new char[]{'a','b','c'}){
                if(s.charAt(s.length()-1)!=ch){
                    q.add(s+ch);
                }
            }
        }
        return ans.size()<k?"":ans.get(k-1);
    }
}