class Solution {
    public int integerBreak(int n) {
        if(n<=3){
            return n-1;
        }
        int div=n/3;
        int rem=n%3;
        if(rem==0){
            return (int)Math.pow(3,div);
        }else if(rem==1){
            return (int)Math.pow(3,div-1)*4;
        }else{
            return (int)Math.pow(3,div)*2;
        }
    }
}