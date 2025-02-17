class Solution {
    public int numTilePossibilities(String tiles) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: tiles.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int ans = 0;
        for(int i=1; i<=tiles.length(); i++) {
            ans += tileFormationsForN(new HashMap<>(map), new HashSet<>(), i, new StringBuilder());
        }

        return ans;
    }

    public int tileFormationsForN(HashMap<Character, Integer> map, HashSet<String> strs, int n, StringBuilder currStr) {
        if(currStr.length() == n) {
            if(!strs.contains(currStr.toString())) {
                strs.add(currStr.toString());
                return 1;
            }
            else {
                return 0;
            }
        }
        for(char ch: map.keySet()) {
            if(map.get(ch) > 0) {
                currStr.append(ch);
                map.put(ch, map.get(ch)-1);
                tileFormationsForN(map, strs, n, currStr);
                currStr.delete(currStr.length()-1, currStr.length());
            map.put(ch, map.get(ch)+1);
            }
        }

        return strs.size();
    }
}