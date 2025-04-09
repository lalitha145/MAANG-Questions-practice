public class Solution {
    public static String[] reorderLogFiles(String[] logs) {
        // Separate letter-logs and digit-logs
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            String[] parts = log.split(" ", 2);
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log); // Digit-log
            } else {
                letterLogs.add(log); // Letter-log
            }
        }

        // Manual bubble sort for letterLogs
        for (int i = 0; i < letterLogs.size(); i++) {
            for (int j = 0; j < letterLogs.size() - i - 1; j++) {
                if (compare(letterLogs.get(j), letterLogs.get(j + 1)) > 0) {
                    // Swap
                    String temp = letterLogs.get(j);
                    letterLogs.set(j, letterLogs.get(j + 1));
                    letterLogs.set(j + 1, temp);
                }
            }
        }

        // Combine sorted letter logs and original digit logs
        List<String> result = new ArrayList<>();
        result.addAll(letterLogs);
        result.addAll(digitLogs);

        return result.toArray(new String[0]);
    }

    // Custom comparator for letter logs
    private static int compare(String log1, String log2) {
        String[] parts1 = log1.split(" ", 2);
        String[] parts2 = log2.split(" ", 2);

        int cmp = parts1[1].compareTo(parts2[1]);
        if (cmp != 0) {
            return cmp;
        }
        return parts1[0].compareTo(parts2[0]); // compare identifiers if contents are equal
    }

    public static void main(String[] args) {
        String[] logs = {
            "dig1 8 1 5 1",
            "let1 art can",
            "dig2 3 6",
            "let2 own kit dig",
            "let3 art zero"
        };

        String[] result = reorderLogFiles(logs);
        for (String log : result) {
            System.out.println(log);
        }
    }
}
