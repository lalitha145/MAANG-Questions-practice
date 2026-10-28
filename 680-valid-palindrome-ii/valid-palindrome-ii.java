class Solution {
    public boolean validPalindrome(String s) {
        return helper(s, 0, s.length()-1, 0);
    }
    boolean helper(String s, int i, int j, int cnt){
        if(i>=j) {
            if(cnt<=1) return true;
        }
        if(s.charAt(i)==s.charAt(j)) return helper(s,i+1,j-1,cnt);
        if(cnt<=0){
            return helper(s,i+1,j,cnt+1) || helper(s,i,j-1, cnt+1);
        }else{
            return false;
        }

    }

}