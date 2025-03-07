class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = sieve(right); 
        List<Integer> primes = new ArrayList<>();
        
        for (int i = Math.max(2, left); i <= right; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        int minDiff = Integer.MAX_VALUE;
        int[] ans = {-1, -1};
        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = primes.get(i - 1);
                ans[1] = primes.get(i);
            }
        }
        
        return ans;
    }
     boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}