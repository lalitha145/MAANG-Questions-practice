class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        int i=0;
        String ans="";
        for(List<String> l:knowledge){
            map.put(l.get(0),l.get(1));
        }
        while(i<s.length()){

            if(s.charAt(i)=='('){
                StringBuilder sb=new StringBuilder();
                int j=i+1;
                while(j<s.length() && s.charAt(j)!=')'){
                    sb.append(s.charAt(j++));
                }
                if(!map.containsKey(sb.toString())){
                    ans+='?';
                }else{
                ans+=map.get(sb.toString());
                }
                i=j+1;
            }else{

                ans+=s.charAt(i);
                i++;
               
            }
          
        }
        return ans;
    }
}