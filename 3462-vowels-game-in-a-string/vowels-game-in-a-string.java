class Solution {
    public boolean doesAliceWin(String s) {
        String vowels="aeiou";
        for(char c: vowels.toCharArray()){
            if(s.indexOf(c)!=-1) return true;
        }
        return false;
    }
}