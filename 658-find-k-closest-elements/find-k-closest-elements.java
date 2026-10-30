class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(i, Math.abs(arr[i] - x));
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int diff = map.get(a) - map.get(b);

                if (diff == 0) {
                    return arr[a] - arr[b];
                }

                return diff;
            });

        for (int i = 0; i < arr.length; i++) {
            pq.add(i); // add index, not difference
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty() && k-- > 0) {
            ans.add(arr[pq.poll()]);
        }

        Collections.sort(ans);
        return ans;
    }
}