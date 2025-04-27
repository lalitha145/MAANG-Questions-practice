class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
       Map<Integer, TreeSet<Integer>> map1 = new HashMap<>();
        Map<Integer, TreeSet<Integer>> map2 = new HashMap<>();

        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            map1.computeIfAbsent(x, k -> new TreeSet<>()).add(y);
            map2.computeIfAbsent(y, k -> new TreeSet<>()).add(x);
        }
            System.out.println(map1);
            System.out.println(map2);

        int ans = 0;
        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            TreeSet<Integer> s1 = map1.get(x);
            TreeSet<Integer> s2 = map2.get(y);

            boolean l  = s1.lower(y)  != null;
            boolean r = s1.higher(y) != null;
            boolean t    = s2.higher(x)  != null;
            boolean bottom  = s2.lower(x) != null;

            if (l && r&& t&& bottom) {
                ans++;
            }
        }

        return ans;
    }
}