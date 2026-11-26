class Solution {
    public int distinctEchoSubstrings(String text)
    {
        int count = 0;

        long base = 31;
        long mod = (long) 1e9 + 7;

        Set<Long> seen = new HashSet<>();

        int n = text.length();
        long[] pow = new long[n + 1];
        long[] pref = new long[n + 1];
        pow[0] = 1;
        pref[0] = 0;
        for (int i = 0; i < n; i++)
        {
            pow[i + 1] = (pow[i] * base) % mod;
            System.out.println(pow[i]*text.charAt(i));
            pref[i + 1] = (pref[i] + (pow[i] * text.charAt(i))) % mod;
                          //0+1*(a)=
        }
        System.out.println(Arrays.toString(pow));
        System.out.println(Arrays.toString(pref));

        for (int i = 0; i < text.length(); i++)
        {
            for (int len = 1; len < text.length(); len++)
            {
                int startIndex = i + len;
                int endIndex = (2 * len) + i;
                if (startIndex <= text.length() && endIndex <= text.length())
                {

                    long firstHash = (((pref[startIndex] - pref[i] + mod) % mod) * pow[n - i]) % mod; //in brute force you would be calling substring(i , startIndex) --> O(N)
                    long secondHash = (((pref[endIndex] - pref[startIndex] + mod) % mod) * pow[n - startIndex]) % mod; //in brute force you would be calling substring(startIndex , endIndex) and then equate both , instead of that use rolling hash and equate both hashes in O(1).

                    if (firstHash == secondHash && !seen.contains(firstHash))
                    {
                        count++;
                        seen.add(firstHash);
                    }
                }
            }
        }
        return count;
    }
}