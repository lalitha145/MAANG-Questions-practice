class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                st.pop();
            }else{
                st.push(c);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}