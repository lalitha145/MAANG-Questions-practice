public class Solution {
    public String alphabetBoardPath(String target) {
        Map<Character, int[]> charMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            charMap.put((char) ('a' + i), new int[]{i / 5, i % 5});
        }
        
        StringBuilder result = new StringBuilder();
        int currRow = 0, currCol = 0;

        for (char ch : target.toCharArray()) {
            int[] pos = charMap.get(ch);
            int newRow = pos[0], newCol = pos[1];

            while (currRow > newRow) {
                result.append("U");
                currRow--;
            }
            while (currCol > newCol) {
                result.append("L");
                currCol--;
            }
            while (currRow < newRow) {
                result.append("D");
                currRow++;
            }
            while (currCol < newCol) {
                result.append("R");
                currCol++;
            }
            result.append("!");
        }
        return result.toString();
    }

    
}
