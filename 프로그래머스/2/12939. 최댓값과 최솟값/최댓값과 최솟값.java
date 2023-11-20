import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] sortedStrArr = Arrays
          .stream(s.split(" "))
          .map(e -> Integer.valueOf(e))
          .sorted()
          .map(e -> String.valueOf(e))
          .toArray(String[]::new);
        return sortedStrArr[0] + " " + sortedStrArr[sortedStrArr.length - 1];
  
    }
}