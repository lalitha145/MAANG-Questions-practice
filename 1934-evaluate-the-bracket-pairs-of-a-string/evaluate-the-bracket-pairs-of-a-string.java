class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        Stack<Character> stack=new Stack<>();
        for(List<String> l:knowledge){
           map.put(l.get(0),l.get(1));
        }
        String ans="";
        for(int i=0;i<s.length();){
           
           char c=s.charAt(i);
           if(c=='('){
            String temp="";
            i++;
             while(i<s.length() && s.charAt(i)!=')'){
                temp+=s.charAt(i);
                i++;
             }
             i++;
            //  System.out.println()
             ans+=map.get(temp)==null?"?":map.get(temp);
           }else{
            ans+=c;
            i++;
           }
        }
        return ans;

    }
}