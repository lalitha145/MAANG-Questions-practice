class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt=0;
        int left=0,right=s1.length()-1;
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        
            while(left<s1.length() && s1.charAt(left)==s2.charAt(left)){
               left++;
            }
            while(right>=0 && s1.charAt(right)==s2.charAt(right)){
                right--;
            }
            if(right>=0 && left<s1.length()){
                char temp=b[left];
                b[left]=b[right];
                b[right]=temp;
            }
        
        return new String(a).equals(new String(b));

    }
}