class Solution {
    public String getHappyString(int n, int k) {
        List<String> l=new LinkedList<>();
        helper(n,l,"",0);
       // Collections.sort(l);
        return l.size()<k?"":l.get(k-1);
    }
    void helper(int n,List<String> l,String s,int ind){
      if(ind==n){
        l.add(s);
        return;
      }
      for(char c='a';c<='c';c++){
        if(s.length()==0 ||s.charAt(s.length()-1)!=c){
            helper(n,l,s+c,ind+1);
        }
      }
    }
}