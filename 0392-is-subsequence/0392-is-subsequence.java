class Solution {
    public boolean isSubsequence(String s, String t) {
      int k=0;
      for(char c:t.toCharArray()){
          if(k<s.length () && c==s.charAt(k)){
              k++;
          }
      }
      return k==s.length();
    }
}