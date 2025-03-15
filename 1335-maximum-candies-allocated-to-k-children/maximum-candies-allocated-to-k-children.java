class Solution {
    public int maximumCandies(int[] candies, long k) {
        long low = 1, high = Arrays.stream(candies).max().getAsInt();
        long sum = 0;
        for(int ele:candies) sum+=ele;
        
        if (sum < k) return 0;
        long ans=0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (canAllocate(mid, candies, k)) {
                low = mid + 1;
                ans=mid;
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }

    boolean canAllocate(long mid, int[] candies, long k) {
        long cnt = 0;
        for (int ele : candies) {
            cnt += ele / mid;
        }
        return cnt >= k;
    }
}
