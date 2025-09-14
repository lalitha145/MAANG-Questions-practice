class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int ele : nums)
            sum += ele;
        return sum % k;
    }
}