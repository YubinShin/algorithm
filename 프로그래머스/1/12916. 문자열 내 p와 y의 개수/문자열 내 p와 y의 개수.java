import java.util.Arrays;

class Solution {
    boolean solution(String s) {
        return (
            Arrays
              .stream(s.toLowerCase().split(""))
              .filter(e -> e.equals("p"))
              .toArray()
              .length ==
            Arrays
              .stream(s.toLowerCase().split(""))
              .filter(e -> e.equals("y"))
              .toArray()
              .length
          )
          ? true
          : false;
    }
}