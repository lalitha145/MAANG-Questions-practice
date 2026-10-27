class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        System.out.println(s);
        int i=0, j=s.length()-1;
        while(i<j){
            while(i<j && !(Character.isLetterOrDigit(s.charAt(i)))) {
                i++;
            }
            while(j>i && !(Character.isLetterOrDigit(s.charAt(j)))) {
                j--;
            }
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}