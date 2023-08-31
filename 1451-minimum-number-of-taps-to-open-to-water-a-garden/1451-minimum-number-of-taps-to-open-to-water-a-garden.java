class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] intervals = new int[n];
        Arrays.fill(intervals, -1);
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] == 0) continue;
            int left = i - ranges[i] >= 0 ? i - ranges[i] : 0;
            int right = i + ranges[i];
            intervals[left] = Math.max(intervals[left], right);
        }
        if (intervals[0] == -1) return -1;
        int longest = intervals[0];
        int count = 1;
        int i = 0;
        while (longest < n) {
            int temp = Integer.MIN_VALUE;
            for (; i <= longest; i++) {
                int val = intervals[i];
                if (val == -1) continue;
                temp = Math.max(temp, val);
            }
            if (temp <= longest) return -1;
            longest = temp;
            count++;
        }
        return count;
    }
}