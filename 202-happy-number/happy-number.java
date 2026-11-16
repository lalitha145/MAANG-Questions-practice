class Solution {
    public boolean isHappy(int n) {
        int fast=n, slow=n;
        do{
            slow= square(slow);
            fast= square( square(fast));
        }while(slow!=fast);
        return slow==1;
    }
     public int square(int num) {
        
        int ans = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
     }
}