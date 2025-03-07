class Solution {
    public int shortestPath(int[][] grid, int k) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] vis = new boolean[rows][cols][k + 1];

        queue.add(new int[]{0, 0, k, 0}); // row, col, remaining_k, steps
        vis[0][0][k] = true;

        int[][] dir = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}}; 

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int r = poll[0], c = poll[1], remainingK = poll[2], steps = poll[3];

            if (r == rows - 1 && c == cols - 1) return steps;

            for (int[] d : dir) {
                int nr = r + d[0], nc = c + d[1];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    int newK = remainingK - grid[nr][nc];

                    if (newK >= 0 && !vis[nr][nc][newK]) {
                        vis[nr][nc][newK] = true;
                        queue.add(new int[]{nr, nc, newK, steps + 1});
                    }
                }
            }
        }
        return -1;
    }
}
