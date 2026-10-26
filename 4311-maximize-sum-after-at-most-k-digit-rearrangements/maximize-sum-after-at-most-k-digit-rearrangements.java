
import java.util.Arrays;

class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long[] gains = new long[n];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += nums[i];

            char[] digits = String.valueOf(nums[i]).toCharArray();
            Arrays.sort(digits);

            long maxNumber = Long.parseLong(
                new StringBuilder(new String(digits))
                    .reverse()
                    .toString()
            );

            gains[i] = maxNumber - nums[i];
        }

        Arrays.sort(gains);

        for (int i = n - 1; i >= 0 && k > 0; i--) {
            ans += gains[i];
            k--;
        }

        return ans;
    }
}
