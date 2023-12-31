class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> set=new HashSet<>();
      int i=0;
      int j=0;
      int ans=0;
      while(j<s.length()){
          while(set.contains(s.charAt(j))){
              set.remove(s.charAt(i));
              i++;
          }
          ans=Math.max(ans,j-i+1);
          set.add(s.charAt(j));
          j++;
      }
      return ans;

    }
}