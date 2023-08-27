class Solution {
    public String maxValue(String s, int x) {
            String ans="";
            if(s.charAt(0)=='-'){
                int i=1;
                while(i<s.length() && x>=(s.charAt(i)-'0')){
                    i++;
                }
                ans=s.substring(0,i)+x+s.substring(i,s.length());
            }else{
                 int i=0;
                while(i<s.length() && x<=(s.charAt(i)-'0')){
                    i++;
                }
                ans=s.substring(0,i)+x+s.substring(i,s.length());

            }
   return ans;
    }
}