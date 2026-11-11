class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int n = nums.length;
        int p = 0;
        while (p < n && nums[p] == target[p]) p++;
        for (int k = p; k + 1 < n; k++) {
            if (target[k] < target[k + 1]) return 0;
        }
        int[] freq = new int[100001];
        for (int k = p; k < n; k++) {
            freq[nums[k]]++;
            freq[target[k]]--;
        }
        for (int k = p; k < n; k++) {
            if (freq[nums[k]] != 0 || freq[target[k]] != 0) return 0;
        }
        int base = Math.min(p, n - 1);
        int ans = 1;
        for (int j = base - 1; j >= 0 && target[j] >= target[j + 1]; j--) {
            ans++;
        }
        return ans;
    }
}