class Solution {
    public int maxProduct(String s) {
        return helper(s,0,"", "");

    }
    int helper(String s, int i, String p1, String p2){
        if(i>=s.length()){
        if(isPalindrome(p1) && isPalindrome(p2)){
            return p1.length()* p2.length();
        }
        return 0;
        }
        int ch1=helper(s,i+1,p1+s.charAt(i), p2);
        int ch2=helper(s,i+1, p1, p2+s.charAt(i));
        int ch3=helper(s,i+1,p1,p2);
        return Math.max(ch1,Math.max(ch2,ch3));
    }
     boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

