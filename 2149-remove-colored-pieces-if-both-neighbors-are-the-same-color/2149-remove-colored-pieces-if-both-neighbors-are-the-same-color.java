class Solution {
    public boolean winnerOfGame(String s) {
       // StringBuilder sb=new StringBuilder(colors);
          int c1=0;
          int c2=0;
           int a=0;
           int b=0;
        for(int i=0;i<s.length();i++){
           
           if(s.charAt(i)=='A'){
              a++;
              if(a>=3){
                  c1++;
              }
              b=0;
           }
           else {
               b++;
               if(b>=3){
                  c2++;
              }
              a=0;
           }
           
           
        }
       if(c1>c2){
           return true;
       }
       return false;
    }
}