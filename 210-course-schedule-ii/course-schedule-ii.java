class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int ans[]=new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int completed = 0;
        int i=0;
        while (!q.isEmpty()) {
            int course = q.poll();
            completed++;
            ans[i++]=course;

            for (int next : adj.get(course)) {
                if (--indegree[next] == 0) {
                    q.add(next);
                }
            }
        }
        if(completed!=numCourses) return new int[]{};

        return ans;
 
    }
}