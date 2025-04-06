class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] type = new int[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] path : paths) {
            int u = path[0] - 1;
            int v = path[1] - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        helper(0, adj, n, type);
        return type;
    }

    boolean helper(int node, List<List<Integer>> adj, int n, int[] color) {
        if(node==n) return true;

        for (int i = 1; i <= 4; i++) {
            if (isSafe(i, adj, color, node)) {
                color[node] = i;
                if(helper(node + 1, adj, n, color)) return true;
                 color[node] = 0;
            }
        }
        return false;
        
    }

    boolean isSafe(int c, List<List<Integer>> adj, int[] color, int node) {
        for (int nb : adj.get(node)) {
            if (color[nb] == c) return false;
        }
        return true;
    }
}
