import java.util.*;

class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        if (n == 1) {
            return 0;
        }

        // Initialize a queue for BFS
        Queue<int[]> queue = new LinkedList<>();

        // Initialize a set to keep track of visited states
        Set<String> visited = new HashSet<>();

        // Initialize the initial states for each node
        for (int i = 0; i < n; i++) {
            int state = (1 << i);
            queue.offer(new int[]{i, state});
            visited.add(i + ":" + state);
        }

        int target = (1 << n) - 1;  // All nodes are visited

        // Initialize the number of steps
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] node = queue.poll();
                int u = node[0];
                int state = node[1];

                if (state == target) {
                    return steps;
                }

                for (int v : graph[u]) {
                    int nextState = state | (1 << v);
                    if (!visited.contains(v + ":" + nextState)) {
                        queue.offer(new int[]{v, nextState});
                        visited.add(v + ":" + nextState);
                    }
                }
            }

            steps++;
        }

        return -1; // No valid path found
    }

    
}
