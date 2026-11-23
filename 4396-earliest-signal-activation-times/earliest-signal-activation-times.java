class Solution {

    public long[] earliestActivationTimes(int n, int[][] edges, int[] requiredSignals) {

        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int delay = e[2];

            adj.get(u).add(new int[]{v, delay});
        }

        long[] ans = new long[n];
        Arrays.fill(ans, -1);

        int[] received = new int[n];

        // {arrivalTime, node}
        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        ans[0] = 0;

        // node 0 sends signals at time 0
        for (int[] nb : adj.get(0)) {
            int next = nb[0];
            int delay = nb[1];

            pq.offer(new long[]{delay, next});
        }

        while (!pq.isEmpty()) {

            long[] cur = pq.poll();

            long time = cur[0];
            int node = (int) cur[1];

            // already activated
            if (ans[node] != -1) {
                continue;
            }

            received[node]++;

            // enough signals received
            if (received[node] == requiredSignals[node]) {

                ans[node] = time;

                // send signals to outgoing neighbors
                for (int[] nb : adj.get(node)) {

                    int next = nb[0];
                    int delay = nb[1];

                    pq.offer(new long[]{time + delay, next});
                }
            }
        }

        return ans;
    }
}