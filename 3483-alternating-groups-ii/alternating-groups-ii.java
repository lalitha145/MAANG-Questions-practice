class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int length = colors.length;
        int result = 0;
        int alternatingElementsCount = 1;
        int lastColor = colors[0];

        for (int index = 1; index < length; index++) {
            if (colors[index] == lastColor) {
                alternatingElementsCount = 1;
                lastColor = colors[index];
                continue;
            }
            alternatingElementsCount++;
            if (alternatingElementsCount >= k) {
                result++;
            }

            lastColor = colors[index];
        }

        for (int index = 0; index < k - 1; index++) {
            if (colors[index] == lastColor) break;
            alternatingElementsCount++;
            if (alternatingElementsCount >= k) {
                result++;
            }

            lastColor = colors[index];
        }
        return result;
    }
}