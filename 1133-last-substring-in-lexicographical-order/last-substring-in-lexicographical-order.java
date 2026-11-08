class Solution {
    public String lastSubstring(String s) {
        int n = s.length();

        int i = 0; // best suffix
        int j = 1; // challenger
        int k = 0;

        while (j + k < n) {

            if (s.charAt(i + k) == s.charAt(j + k)) {
                k++;
            }
            else if (s.charAt(i + k) < s.charAt(j + k)) {
                i = i + k + 1;

                if (i >= j) {
                     j=i+1;
                     
                }

                k = 0;
            }
            else {
                j = j + k + 1;
                k = 0;
            }
        }

        return s.substring(i);
    }
}