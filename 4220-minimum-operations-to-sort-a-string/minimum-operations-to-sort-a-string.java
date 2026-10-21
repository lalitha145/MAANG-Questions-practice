class Solution {
    public int minOperations(String s) {
        if(s.length()<=1) return 0;
        char a[]=s.toCharArray();
        Arrays.sort(a);
        char minChar=a[0];
        char maxChar=a[a.length-1];
        if(new String(a).equals(s)) return 0;
        if(minChar==s.charAt(0) || maxChar==s.charAt(s.length()-1)) return 1;
        if(minChar==s.charAt(s.length()-1) && maxChar==s.charAt(0) && s.length()==2) return -1;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)==minChar || s.charAt(i)==maxChar) return 2;
        }
        return 3;

        

        
    }
}