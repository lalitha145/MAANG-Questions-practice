class Solution {
    public int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0,1}};
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size(), n = grid.get(0).size();

        PriorityQueue<int[]> bfs = new PriorityQueue<>((a,b) -> b[2] - a[2]);
        int[][] maxHealth = new int[m][n];

        bfs.add(new int[]{0, 0, health - grid.get(0).get(0)});
        maxHealth[0][0] = health - grid.get(0).get(0);

        while(!bfs.isEmpty()) {
            int row = bfs.peek()[0], col = bfs.peek()[1], hea = bfs.peek()[2];
            bfs.remove();

            if(row == m - 1 && col == n - 1) return true;

            for(int[] dir : dirs) {
                int nextRow = row + dir[0], nextCol = col + dir[1];

                if(nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n) {

                    int nextHealth = hea - grid.get(nextRow).get(nextCol);

                    if(nextHealth >= 1 && nextHealth > maxHealth[nextRow][nextCol]) {
                        maxHealth[nextRow][nextCol] = nextHealth;
                        bfs.add(new int[]{nextRow, nextCol, nextHealth});
                    }
                }
            }
        }
        return false;
    }
}