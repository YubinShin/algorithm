import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < absolutes.length; i++) {
          if (signs[i] == true) {
            numList.add(absolutes[i]);
          } else {
            numList.add(-absolutes[i]);
          }
        }
        return numList.stream().reduce(0, (a, b) -> a + b).intValue();
  }
}