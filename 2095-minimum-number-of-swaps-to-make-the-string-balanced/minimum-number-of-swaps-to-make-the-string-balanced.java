class Solution {
    public int minSwaps (String s) {
       int open=0, close=0;
       int mismatch=0;
       for(char c: s.toCharArray()){
        if(c=='['){
            open++;
        }else{
            close++;
        }
        if(close>open){
            mismatch++;
            close--;
        }
       }
       return (mismatch+1)/2;
    }
}