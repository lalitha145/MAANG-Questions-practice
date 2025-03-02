class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Stack<Character> st=new Stack<>();
        HashMap<String,String> map=new HashMap<>();
        for(List<String> l:knowledge){
            map.put(l.get(0),l.get(1));
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                i++;
               while(i<s.length() && s.charAt(i)!=')'){
                st.push(s.charAt(i));
                i++;
               }
                String temp="";
               while(!st.isEmpty()){
                temp=st.pop()+temp;
               }
               System.out.println(temp);
               ans+=map.getOrDefault(temp,"?");
            }else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}