class Solution {
    public long countValidSubstrings(String s) {
        long ans=0;
        int i=0, j=0;
        while(j<s.length()){
            if(j>=2 && s.charAt(j-2)=='a' && s.charAt(j-1)=='b' && s.charAt(j)=='c'){
                i=j-1;
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
}