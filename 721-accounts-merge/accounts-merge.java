import java.util.*;

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashMap<String, String> emailToName = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToName.put(email, name);
                map.putIfAbsent(email, new HashSet<>());

                if (i > 1) {
                    map.get(email).add(account.get(i - 1));
                    map.get(account.get(i - 1)).add(email);
                }
            }
        }

        Set<String> visited = new HashSet<>();
        for (String email : emailToName.keySet()) {
            if (!visited.contains(email)) {
                List<String> mergedAccount = new ArrayList<>();
                dfs(email, map, visited, mergedAccount);
                Collections.sort(mergedAccount);
                mergedAccount.add(0, emailToName.get(email)); 
                ans.add(mergedAccount);
            }
        }

        return ans;
    }

    private void dfs(String email, HashMap<String, HashSet<String>> map, Set<String> visited, List<String> mergedAccount) {
        visited.add(email);
        mergedAccount.add(email);
        for (String neighbor : map.get(email)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, map, visited, mergedAccount);
            }
        }
    }
}
