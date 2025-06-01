import java.util.*;

class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        long pro = 1;
        for (int ele : nums) pro *= ele;

        // If the product of all elements is not equal to target * target, return false
        if (pro != target * target) return false;

        Map<String, Boolean> memo = new HashMap<>();
        return helper(nums, target, 1, 0, memo);
    }

    boolean helper(int[] nums, long target, long pro, int i, Map<String, Boolean> memo) {
        if (i >= nums.length) return false;

        // Memoization key based on index and current product
        String key = i + "-" + pro;
        if (memo.containsKey(key)) return memo.get(key);

        // If current product equals target, one subset is found
        if (pro == target) return true;

        // Choose current number
        boolean pick = helper(nums, target, pro * nums[i], i + 1, memo);
        // Skip current number
        boolean notPick = helper(nums, target, pro, i + 1, memo);

        boolean result = pick || notPick;
        memo.put(key, result);
        return result;
    }
}
