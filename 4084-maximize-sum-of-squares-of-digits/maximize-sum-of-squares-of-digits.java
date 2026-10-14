class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum==0 || num*9<sum) return "";
        StringBuilder sb=new StringBuilder();
        while(sum>0){
           if(sum>=9){
            sb.append('9');
            sum-=9;
           }else{
              sb.append((char)('0'+sum));
              sum=0;
           }
        }
        while(sb.length()<num) sb.append('0');
        
        return sb.toString();
       }
}