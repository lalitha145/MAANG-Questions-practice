class Solution {
    public int countMagicalPairs(String s) {
        int n = s.length();

        // leftCnt[j][d] = number of substrings ending at j
        // having exactly d distinct characters
        int[][] leftCnt = new int[n][27];

        for (int j = 0; j < n; j++) {
            int[] freq = new int[26];
            int distinct = 0;

            for (int i = j; i >= 0; i--) {
                int ch = s.charAt(i) - 'a';

                if (freq[ch] == 0) {
                    distinct++;
                }
                freq[ch]++;

                leftCnt[j][distinct]++;
            }
        }

        // rightCnt[i][d] = number of substrings starting at i
        // having exactly d distinct characters
        int[][] rightCnt = new int[n][27];

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int distinct = 0;

            for (int k = i; k < n; k++) {
                int ch = s.charAt(k) - 'a';

                if (freq[ch] == 0) {
                    distinct++;
                }
                freq[ch]++;

                rightCnt[i][distinct]++;
            }
        }

        long ans = 0;

        // split between j and j+1
        for (int j = 0; j < n - 1; j++) {
            for (int d = 1; d <= 26; d++) {
                ans += (long) leftCnt[j][d] * rightCnt[j + 1][d];
            }
        }

        return (int) ans;
    }
}