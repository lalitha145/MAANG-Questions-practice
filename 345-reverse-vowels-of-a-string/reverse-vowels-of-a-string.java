class Solution {
    public String reverseVowels(String s) {
        int start=0, end=s.length()-1;
        char a[]=s.toCharArray();
       String vowels="aeiou";
       String cVowels="AEIOU";
        while(start<end){
            while(start<end && (vowels.indexOf(a[start])==-1 && cVowels.indexOf(a[start])==-1)){
                start++;
            }
             while(end>start && (vowels.indexOf(a[end])==-1 && cVowels.indexOf(a[end])==-1)){
                end--;
            }
            char t=a[start];
            a[start]=a[end];
            a[end]=t;
            start++;
            end--;
           

        }
        return new String(a);
    }
}