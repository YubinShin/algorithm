class Solution {
    boolean solution(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            char token = s.charAt(i);
            if (token == '(') {
                counter++;
            } else if (token == ')') {
                counter--;
                if (counter < 0) {
                    return false;
                }
            }
        }

        return counter == 0;
    }
}