class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                char temp=s.charAt(i);
                while(i<j && s.charAt(i)==temp) i++;
                while(j>=0 && s.charAt(j)==temp) j--;
            }else{
                return j-i+1;
            }
        }
        if(i==j) return 1;
        return 0;
    }
}