class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[][] dp = new int[2001][2001]; 

    public boolean canCross(int[] stones) {
        for (int i = 0 ; i < stones.length; i++) {
            map.put(stones[i], i);
        }
        for (int i = 0; i < 2000; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(stones, 0, 0) == 1;
    }
  int solve(int[] s, int curr, int prev){
        if(curr >= s.length) return 0;
        if(curr == s.length - 1) return 1;

        if(dp[curr][prev] != -1) return dp[curr][prev];

        int n1 = prev + 1;
        int n2 = prev - 1;
        int n3 = prev;

        int a = 0;

        if(n1 > 0 && map.containsKey(s[curr] + n1)){
            a = Math.max(a, solve(s, map.get(s[curr] + n1), n1));
        }
        if(n2 > 0 && map.containsKey(s[curr] + n2)){
            a = Math.max(a ,solve(s, map.get(s[curr] + n2), n2));
        }
        if(n3 > 0 && map.containsKey(s[curr] + n3)){
            a = Math.max(a, solve(s, map.get(s[curr] + n3), n3));
        }
        return dp[curr][prev] = a;
    }


}