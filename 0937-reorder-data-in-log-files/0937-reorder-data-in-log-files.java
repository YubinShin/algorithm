class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> numLogs = new ArrayList<>();

        for (String log : logs) {
            String[] logArr = log.split(" ");
            if (Character.isDigit(logArr[1].charAt(0))) {
                numLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        letterLogs.sort((a, b) -> {
            String[] aParts = a.split(" ", 2); 
            String[] bParts = b.split(" ", 2);
            int contentComparison = aParts[1].compareTo(bParts[1]);

            if (contentComparison == 0) {
                return aParts[0].compareTo(bParts[0]);
            } else {
                return contentComparison;
            }
        });

        List<String> combinedList = new ArrayList<>();
        combinedList.addAll(letterLogs);
        combinedList.addAll(numLogs);

        return combinedList.toArray(new String[0]);
    }
}