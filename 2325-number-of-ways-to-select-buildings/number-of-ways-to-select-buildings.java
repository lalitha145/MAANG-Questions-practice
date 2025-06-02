class Solution {
    public long numberOfWays(String s) {
        int n = s.length();
        long count0 = 0, count1 = 0;
        long count01 = 0, count10 = 0;
        long result = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                result += count10;   
                count0++;
                count01 += count1;  
            } else {
                result += count01;  
                count1++;
                count10 += count0;  
            }
        }
        return result;
    }
}
