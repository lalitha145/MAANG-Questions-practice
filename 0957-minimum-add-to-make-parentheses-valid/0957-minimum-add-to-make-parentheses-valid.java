class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    ans++;
                }
               if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            ans++;
            st.pop();
        }
        return ans;
    }
}