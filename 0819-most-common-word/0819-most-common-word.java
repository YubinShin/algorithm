class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] processedParagraph = paragraph.replaceAll("\\W+", " ").split(" ");

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> map = new HashMap<>();
        for (String word : processedParagraph) {
            String processedWord = word.toLowerCase();
            if (!bannedSet.contains(processedWord)) {
                map.put(processedWord, map.getOrDefault(processedWord, 0) + 1);
            }
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}