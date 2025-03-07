import java.util.*;

class Solution {
    static class State {
        int node, cost;
        Set<Integer> visited;

        State(int node, Set<Integer> visited, int cost) {
            this.node = node;
            this.visited = new HashSet<>(visited);
            this.cost = cost;
        }
    }

    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        Queue<State> queue = new LinkedList<>();
        Set<String> visitedStates = new HashSet<>();

        // Initialize the queue with all nodes as starting points
        for (int i = 0; i < n; i++) {
            Set<Integer> startSet = new HashSet<>();
            startSet.add(i);
            String stateKey = i + "," + sortedVisitedNodes(startSet);
            queue.offer(new State(i, startSet, 0));
            visitedStates.add(stateKey);
        }

        while (!queue.isEmpty()) {
            State curr = queue.poll();
            
            // If all nodes are visited, return the cost
            if (curr.visited.size() == n) {
                return curr.cost;
            }

            // Traverse all neighbors
            for (int neighbor : graph[curr.node]) {
                Set<Integer> newVisited = new HashSet<>(curr.visited);
                newVisited.add(neighbor);
                String stateKey = neighbor + "," + sortedVisitedNodes(newVisited);

                if (!visitedStates.contains(stateKey)) {
                    queue.offer(new State(neighbor, newVisited, curr.cost + 1));
                    visitedStates.add(stateKey);
                }
            }
        }
        return -1; // This should never happen
    }

    private String sortedVisitedNodes(Set<Integer> visitedSet) {
        List<Integer> sortedList = new ArrayList<>(visitedSet);
        Collections.sort(sortedList);
        return sortedList.toString();  // Convert {0,1,2} → "0,1,2"
    }
}
