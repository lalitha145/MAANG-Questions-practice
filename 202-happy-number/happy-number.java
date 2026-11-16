class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            int sum=helper(n);
            if(set.contains(sum)) return false;
            set.add(sum);
            n=sum;

        }
        return n==1;
    }
    int helper(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=(r*r);
            n/=10;
        }
        return sum;
    }
}