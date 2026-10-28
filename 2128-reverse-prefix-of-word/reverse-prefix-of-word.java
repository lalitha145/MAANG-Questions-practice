class Solution {
    public String reversePrefix(String word, char ch) {
        char a[]=word.toCharArray();
        int index=word.indexOf(ch);
        if(ch==-1) return word;
        for(int i=0,j=index;i<j;i++,j--){
            char t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        return new String(a);
    }
}