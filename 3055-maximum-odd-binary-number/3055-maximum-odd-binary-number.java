class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        int zeroes=0;
        for(char c:s.toCharArray()){
            if(c=='0'){
                zeroes++;
            }else{
                ones++;
            }
        }
        String ans="";
        if(ones==1){
            while(zeroes>0){
                ans+='0';
                zeroes--;
            }
            ans+='1';
            return ans;
        }else{
            while(ones>1){
                ans+='1';
                ones--;
            }
            while(zeroes>0){
                ans+='0';
                zeroes--;
            }
            ans+='1';
            return ans;
        }
    }
}