class Solution {
    public long countValidSubstrings(String s) {
        long ans=0;
        long lastA=-1, lastB=-1;
        long start=0;
        for(int end=0;end<s.length();end++){
            if(s.charAt(end)=='a'){
                lastA=end;
            }
            else if(s.charAt(end)=='b'){
                lastB=lastA;
            }
            else if(s.charAt(end)=='c' && lastB!=-1){
                 start=Math.max(start, lastB+1);
            }
            ans+=(end-start+1);
        }
        return ans;
    }
}