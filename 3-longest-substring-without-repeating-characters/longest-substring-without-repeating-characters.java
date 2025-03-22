class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        HashSet<Character> set=new HashSet<>();
        int max=0;
        for(int end=0;end<s.length();end++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
            max=Math.max(max,end-start+1);
        }
        return max;
    }
}
