class Solution {

public int numDecodings(String s) {
	Integer[] memo = new Integer[s.length() + 1];
	return numDecodings(s, 0, memo);
}

private int numDecodings(String s, int index, Integer[] memo) {
	if (index == s.length()) {
		return 1;
	}
	if (s.charAt(index) == '0') {
		return 0;
	}
	if (memo[index] != null) {
		return memo[index];
	}
	int way1 = numDecodings(s, index + 1, memo);
	int way2 = 0;
	if (index < s.length() - 1 && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
		way2 = numDecodings(s, index + 2, memo);
	}
	memo[index] = way1 + way2;
	return memo[index];
}
}