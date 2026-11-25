class Solution {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        s=s.toLowerCase();
        while(i<=j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            if(left==right) {
                i++;
                j--;
            }
           else if(!Character.isLetter(left) && !Character.isDigit(left)){
                i++;
            }
            else if(!Character.isLetter(right) && !Character.isDigit(right)){
                j--;
            }else return false;

        }
        return i>j;
    }
}