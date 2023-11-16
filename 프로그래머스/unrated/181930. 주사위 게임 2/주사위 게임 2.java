import java.util.Set;
import java.util.HashSet;

class Solution {
  public static int solution(int a, int b, int c) {
    int answer = 0;
    Set<Integer> numSet = new HashSet<>();
    numSet.add(a);
    numSet.add(b);
    numSet.add(c);

    if (numSet.size() == 1) {
      return (int) (
        (a + b + c) *
        (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) *
        (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3))
      );
    }
    if (numSet.size() == 2) {
      return (int) (
        (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
      );
    }
    if (numSet.size() == 3) {
      return a + b + c;
    }
    return answer;
  }
}

// Exception in thread "main" java.lang.IllegalArgumentException: duplicate element: 3
// 이 오류 메시지는 Set.of 메서드를 사용할 때 동일한 요소를 여러 번 포함하려고 할 때 발생합니다. Set.of는 중복을 허용하지 않는 불변 셋을 생성하기 때문에, 동일한 값을 여러 번 포함할 수 없습니다. 이 경우, a, b, c의 값 중 일부가 동일하여 발생한 문제로 보입니다. 이 문제를 해결하기 위해서는 중복을 허용하는 다른 방법으로 셋을 생성해야 합니다. 예를 들어, HashSet을 사용할 수 있습니다. HashSet은 중복된 요소를 자동으로 필터링합니다.