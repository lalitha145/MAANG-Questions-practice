class Solution {
    public boolean checkPowersOfThree(int n) {
      while(n>1){
        if(n%3==2) return false;
        n=n/3;
      }
     // System.out.println(n);
      return n==1;
    }
}
