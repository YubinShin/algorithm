class Solution {
    public boolean isPalindrome(String s) {
        String processedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = new StringBuilder(processedString).reverse().toString();
        if (processedString.equals(reversedString)) {
            return true;
        }
        return false;
    }
}