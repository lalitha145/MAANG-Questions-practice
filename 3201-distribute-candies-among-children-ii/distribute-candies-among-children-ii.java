class Solution {
  public long distributeCandies(int n, int limit) {
    long count = 0;
    for (int a = Math.max(0, n - 2 * limit); a <= Math.min(limit, n); a++) {
      int b = Math.min(limit, n - a) - Math.max(0, n - a - limit) + 1;
      count += Math.max(0, b);
    }

    return count;
  }
}