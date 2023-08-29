class Solution {
    public int bestClosingTime(String customers) {
        int initialPanelty = 0;
       
        int []eg=new int[ customers.length()+1];
      
        for(int i=0;i< customers.length();i++){
            if( customers.charAt(i)=='N'){
                initialPanelty++;
            }
        }
        eg[ customers.length()]=initialPanelty;
        for(int i= customers.length()-1; i>=0; i--){
            if( customers.charAt(i)=='N'){
                eg[i]=eg[i+1]-1;
            }else{
                eg[i]=eg[i+1]+1;
            }
        }

        int min=Integer.MAX_VALUE, res=-1;
        for(int i=0;i<eg.length; i++){
            if(min > eg[i]){
                res=i;
                min=eg[i];
            }
        }
        return res;
    }
}