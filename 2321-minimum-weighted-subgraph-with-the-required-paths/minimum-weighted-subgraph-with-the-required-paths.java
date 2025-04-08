class Pair {
    int node;
    long weight;
    public Pair(int node, long weight) {
        this.node = node;
        this.weight = weight;
    }
}

class Solution {
    public long minimumWeight(int n, int[][] edges, int src1, int src2, int dest) {
        List<List<Pair>> adj = new ArrayList<>();
        List<List<Pair>> revAdj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            revAdj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(new Pair(e[1], e[2]));
            revAdj.get(e[1]).add(new Pair(e[0], e[2])); // reverse graph
        }

        long[] fromSrc1 = dijkstra(n, adj, src1);
        long[] fromSrc2 = dijkstra(n, adj, src2);
        long[] toDest = dijkstra(n, revAdj, dest);

        long minTotal = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (fromSrc1[i] == Long.MAX_VALUE || fromSrc2[i] == Long.MAX_VALUE || toDest[i] == Long.MAX_VALUE) {
                continue;
            }
            long total = fromSrc1[i] + fromSrc2[i] + toDest[i];
            minTotal = Math.min(minTotal, total);
        }

        return minTotal == Long.MAX_VALUE ? -1 : minTotal;
    }

    private long[] dijkstra(int n, List<List<Pair>> graph, int start) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.weight, b.weight));
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[start] = 0;
        pq.add(new Pair(start, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            long weight = curr.weight;

            if (weight > dist[node]) continue;

            for (Pair neighbor : graph.get(node)) {
                int next = neighbor.node;
                long edgeWeight = neighbor.weight;
                if (dist[next] > weight + edgeWeight) {
                    dist[next] = weight + edgeWeight;
                    pq.add(new Pair(next, dist[next]));
                }
            }
        }

        return dist;
    }
}
