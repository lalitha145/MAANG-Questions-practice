class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0, j=s.length()-1;
        char a[]=s.toCharArray();
        while(i<j){
            while(i<j && !Character.isLetter(a[i])){
                i++;
            }
            while(i<j && !Character.isLetter(a[j])){
                j--;
            }
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
            
        }
        return new String(a);
    }
}