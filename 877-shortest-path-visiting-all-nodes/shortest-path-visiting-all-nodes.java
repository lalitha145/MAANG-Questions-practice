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
                for (int i = 0; i < n; i++) {
            Set<Integer> startSet = new HashSet<>();
            startSet.add(i);
            queue.offer(new State(i, startSet, 0));
            visitedStates.add(i + "," + startSet);
        }
        
        while (!queue.isEmpty()) {
            State curr = queue.poll();
            if (curr.visited.size() == n) {
                return curr.cost;
            }
            for (int neighbor : graph[curr.node]) {
                Set<Integer> newVisited = new HashSet<>(curr.visited);
                newVisited.add(neighbor);
                String stateKey = neighbor + "," + newVisited;
                
                if (!visitedStates.contains(stateKey)) {
                    queue.offer(new State(neighbor, newVisited, curr.cost + 1));
                    visitedStates.add(stateKey);
                }
            }
        }
        
        return -1; 
    }
}