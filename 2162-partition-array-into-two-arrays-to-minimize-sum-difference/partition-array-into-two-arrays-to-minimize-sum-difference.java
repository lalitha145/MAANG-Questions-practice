class Solution {
    public int minimumDifference(int[] nums) {
        int n = nums.length / 2;
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        List<Integer>[] left = generateSums(nums, 0, n);
        List<Integer>[] right = generateSums(nums, n, nums.length);

        int minDiff = Integer.MAX_VALUE;

        for (int k = 0; k <= n; k++) {
            List<Integer> leftSums = left[k];
            List<Integer> rightSums = right[n - k];
            Collections.sort(rightSums);

            for (int lSum : leftSums) {
                int target = totalSum / 2 - lSum;
                int idx = Collections.binarySearch(rightSums, target);
                if (idx < 0) idx = -idx - 1;

                if (idx < rightSums.size()) {
                    int sum1 = lSum + rightSums.get(idx);
                    int sum2 = totalSum - sum1;
                    minDiff = Math.min(minDiff, Math.abs(sum1 - sum2));
                }
                if (idx > 0) {
                    int sum1 = lSum + rightSums.get(idx - 1);
                    int sum2 = totalSum - sum1;
                    minDiff = Math.min(minDiff, Math.abs(sum1 - sum2));
                }
            }
        }
        return minDiff;
    }

    private List<Integer>[] generateSums(int[] nums, int start, int end) {
        int n = end - start;
        List<Integer>[] res = new List[n + 1];
        for (int i = 0; i <= n; i++) res[i] = new ArrayList<>();
        int[] part = Arrays.copyOfRange(nums, start, end);
        int total = 1 << n;

        for (int mask = 0; mask < total; mask++) {
            int cnt = 0, sum = 0;
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1) == 1) {
                    sum += part[i];
                    cnt++;
                }
            }
            res[cnt].add(sum);
        }
        return res;
    }
}
