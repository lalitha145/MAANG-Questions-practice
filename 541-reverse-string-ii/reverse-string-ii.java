//for every grp of 2k characters revers first k characters
class Solution {
    public String reverseStr(String s, int k1) {
        // if(k1>s.length()) return s;
        char a[]=s.toCharArray();
        int grpSize=2*k1;
        int i=0;
        for(i=0;i<s.length() && i+grpSize<s.length();i=i+grpSize){
            int j=i, k=i+k1-1;
            reverse(a,i,k);
        }
        if(i<s.length()){
            int j=i;
            int k=i+(k1)-1;
            if(k>=s.length()){
                reverse(a,j,a.length-1);
            }else{
                reverse(a,j,k);
            }
        }
        return new String(a);
        
    }
    void reverse(char a[], int j, int k){
          while(j<k){
                char t=a[j];
                a[j]=a[k];
                a[k]=t;
                j++;
                k--;
            }
    }
}