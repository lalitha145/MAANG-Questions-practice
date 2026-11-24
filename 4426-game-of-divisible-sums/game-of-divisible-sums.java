class Solution {

    public long maxDifference(int[] nums) {
        Long[][] dp = new Long[nums.length][2];
        return helper(nums, true, 0, dp);
    }

    long helper(int[] nums, boolean alice, int i, Long[][] dp) {

        if (i >= nums.length)
            return 0;

        int turn = alice ? 1 : 0;

        if (dp[i][turn] != null)
            return dp[i][turn];

        long ans;

        if (alice) {

            long ch1 = nums[i] +
                    helper(nums, nums[i] % 3 != 0, i + 1, dp);

            long ch2 = Long.MIN_VALUE;

            if (i + 1 < nums.length) {
                ch2 = nums[i] + nums[i + 1]
                        + helper(nums,
                                (nums[i] + nums[i + 1]) % 3 != 0,
                                i + 2,
                                dp);
            }

            ans = Math.max(ch1, ch2);

        } else {

            long ch1 = nums[i] +
                    helper(nums, nums[i] % 3 != 0, i + 1, dp);

            long ch2 = Long.MIN_VALUE;

            if (i + 1 < nums.length) {
                ch2 = nums[i] + nums[i + 1]
                        + helper(nums,
                                (nums[i] + nums[i + 1]) % 3 != 0,
                                i + 2,
                                dp);
            }

            ans = -Math.max(ch1, ch2);
        }

        dp[i][turn] = ans;
        return ans;
    }
}