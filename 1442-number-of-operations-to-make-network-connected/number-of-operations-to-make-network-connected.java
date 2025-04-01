class Solution {
    int parent[], rank[];

    int findP(int parent[], int x) {
        if (parent[x] == x) {
            return x;
        }
        parent[x]=findP(parent,parent[x]);
        return parent[x];
    }

    void union(int v, int u) {
        int ulp_u = findP(parent, u);
        int ulp_v = findP(parent, v);
        if (ulp_u == ulp_v) return; 

        if (rank[ulp_u] < rank[ulp_v]) {
            parent[ulp_u] = ulp_v;
        } else if (rank[ulp_u] > rank[ulp_v]) {
            parent[ulp_v] = ulp_u;
        } else {
            parent[ulp_v] = ulp_u;
            rank[ulp_u]++;
        }
    }

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;  

        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0; 
        }

        for (int[] connection : connections) {
            union(connection[0], connection[1]);
        }

        int countOfUnconnectedComputers = 0;
        for (int i = 0; i < n; i++) {
            if (findP(parent, i) == i)  
                countOfUnconnectedComputers++;
        }

        return countOfUnconnectedComputers - 1; 
    }
}
