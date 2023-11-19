import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public long[] solution(int x, int n) {
    List<Long> answer = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (answer.size() == 0) {
        answer.add((long) x);
      } else {
        answer.add(answer.get(i - 1) + (long) x);
      }
    }
    return answer.stream().mapToLong(Long::longValue).toArray();
    }
}

//     System.out.println(Arrays.toString(solution(2, 5)));