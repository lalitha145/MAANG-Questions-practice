class Solution {
    public boolean repeatedSubstringPattern(String s) {
       int n=s.length();
       for(int i=1;i<=n/2;i++){
           if(n%i ==0){
               String substring=s.substring(0,i);
               int x=n/i;
               StringBuilder sb= new StringBuilder();

               for(int j=0;j<x;j++){
                   sb.append(substring);
               }
               if(sb.toString().equals(s)){
                   return true;
               }
           }
       }
       return false; 
    }
}