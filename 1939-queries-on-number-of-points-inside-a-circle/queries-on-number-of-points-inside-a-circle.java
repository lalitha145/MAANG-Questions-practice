import java.util.*;

class Solution {

    public int[] countPoints(int[][] points, int[][] queries) {

        int CELL_SIZE = 100;

        Map<String, List<int[]>> grid = new HashMap<>();

        // Build Grid
        for (int[] p : points) {

            int cellX = p[0] / CELL_SIZE;
            int cellY = p[1] / CELL_SIZE;

            String key = cellX + "," + cellY;

            grid.computeIfAbsent(key, k -> new ArrayList<>())
                .add(p);
        }
        System.out.println(grid);

        int[] ans = new int[queries.length];

        // Process Queries
        for (int i = 0; i < queries.length; i++) {

            int cx = queries[i][0];
            int cy = queries[i][1];
            int r = queries[i][2];

            long r2 = 1L * r * r;

            int count = 0;

            int minCellX = (cx - r) / CELL_SIZE;
            int maxCellX = (cx + r) / CELL_SIZE;

            int minCellY = (cy - r) / CELL_SIZE;
            int maxCellY = (cy + r) / CELL_SIZE;

            for (int gx = minCellX; gx <= maxCellX; gx++) {

                for (int gy = minCellY; gy <= maxCellY; gy++) {

                    String key = gx + "," + gy;

                    List<int[]> bucket = grid.get(key);

                    if (bucket == null)
                        continue;

                    for (int[] p : bucket) {

                        long dx = p[0] - cx;
                        long dy = p[1] - cy;

                        if (dx * dx + dy * dy <= r2) {
                            count++;
                        }
                    }
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}