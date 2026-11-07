
import java.util.*;

class Solution {

    public int[] countPairs(int n, int[][] edges, int[] queries) {

        int[] degree = new int[n + 1];

        // Store multiplicity of each unique edge
        Map<Long, Integer> edgeCount = new HashMap<>();

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            degree[u]++;
            degree[v]++;

            if (u > v) {
                int temp = u;
                u = v;
                v = temp;
            }

            long key = (long) u * (n + 1) + v;

            edgeCount.put(key, edgeCount.getOrDefault(key, 0) + 1);
        }

        // Sort node degrees
        int[] sorted = degree.clone();
        Arrays.sort(sorted, 1, n + 1);

        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {

            int target = queries[q];
            int count = 0;

            // Two pointer approach
            int left = 1;
            int right = n;

            while (left < right) {

                if (sorted[left] + sorted[right] > target) {

                    count += right - left;
                    right--;

                } else {
                    left++;
                }
            }

            // Correct pairs with shared edges
            for (Map.Entry<Long, Integer> entry : edgeCount.entrySet()) {

                long key = entry.getKey();
                int common = entry.getValue();

                int u = (int) (key / (n + 1));
                int v = (int) (key % (n + 1));

                int sum = degree[u] + degree[v];

                if (sum > target && sum - common <= target) {
                    count--;
                }
            }

            answer[q] = count;
        }

        return answer;
    }
}
