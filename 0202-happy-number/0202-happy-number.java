class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> s=new HashSet<>();
       while(n!=1 && !s.contains(n)){
           s.add(n);
           n=helper(n);
       }
       return n==1;
        
    }
    static int helper(int n){
        int sum=0;
        while(n>0){
           int r=n%10;
           sum+=r*r;

            n=n/10;
        }
        return sum;
    }
}