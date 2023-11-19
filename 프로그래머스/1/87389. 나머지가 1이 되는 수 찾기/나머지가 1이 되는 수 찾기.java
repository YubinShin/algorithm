import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        return IntStream
          .range(1, n)
          .filter(item -> n % item == 1)
          .findFirst()
          .getAsInt();
    }
}