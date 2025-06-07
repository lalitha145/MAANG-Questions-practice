class Solution {
    public String clearStars(String s) {
        PriorityQueue<Character> pq=new PriorityQueue<>();
        StringBuilder ans=new StringBuilder();
       for(char c:s.toCharArray()){
           if(c=='*'){
             char ch=pq.poll();
             int ind=ans.lastIndexOf(ch+"");
             ans.deleteCharAt(ind);
           }else{
            ans.append(c);
            pq.add(c);
           }

      } 
      return ans.toString();
    }
}