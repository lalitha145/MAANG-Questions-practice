class Solution {
    public boolean checkPowersOfThree(int n) {
        return helper(n,0,0);
    }
    boolean helper(int n,int sum,int p){
        if(p>20) return false;
        if(sum==n) return true;
        if(sum>n) return false;
        if(p>n) return false;
       // if(sum<=0) return false;
       boolean ch1=helper(n,sum+(int)Math.pow(3,p),p+1);
       boolean ch2=helper(n,sum,p+1);
       return ch1||ch2;
    }
}