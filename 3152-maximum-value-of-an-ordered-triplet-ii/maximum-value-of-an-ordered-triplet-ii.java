class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        long[] maxLeft = new long[n];
        long[] maxRight = new long[n];
        long ans = 0;

        maxLeft[0] = Long.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i - 1]);
        }

        maxRight[n - 1] = Long.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], nums[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            ans = Math.max(ans, (maxLeft[i] - (long) nums[i]) * maxRight[i]);
        }

        return ans;
    }
}
