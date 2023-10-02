class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> prevORs = new HashSet<>();

        for (int i : arr) {
            Set<Integer> currORs = new HashSet<>();
            currORs.add(i);
             for (int j : prevORs) {
                currORs.add(i | j);
            }
            prevORs = currORs;
            ans.addAll(prevORs);
        }

        return ans.size();
    }
}
