class Solution {
    public boolean digitCount(String num) {
        int a[]=new int[10];
        for(char c:num.toCharArray()){
            a[c-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)-'0'!=a[i]){
                return false;
            }
        }
        return true;
    }
}