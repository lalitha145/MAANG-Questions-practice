class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int start=0, end=0;
        HashSet<Character> set=new HashSet<>();
        while(end<s.length()){
            if(set.contains(s.charAt(end))){
                while(set.contains(s.charAt(end))){
                    set.remove(s.charAt(start++));
                }
            }
            set.add(s.charAt(end));
            ans=Math.max(ans,end-start+1);
            end++;

        }
        return ans;
    }
}