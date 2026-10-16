class Solution {
    public String removeDuplicateLetters(String s) {
          Stack<Integer> st=new Stack<>();
          int last[]=new int[26];
          boolean seen[]=new boolean[26];
          for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
          }
          for(int i=0;i<s.length();i++){
            int curr=s.charAt(i)-'a';
            if(seen[curr]){
              continue;
            }
            while(!st.isEmpty() && i<last[st.peek()] && st.peek()>curr){
              seen[st.pop()]=false;
             
            }
     st.push(curr);
     seen[curr]=true;
          }
        
        StringBuilder sb = new StringBuilder();
          while(!st.isEmpty()){
            sb.append((char)(st.pop()+'a'));

          }
          return sb.reverse().toString();
    }
}