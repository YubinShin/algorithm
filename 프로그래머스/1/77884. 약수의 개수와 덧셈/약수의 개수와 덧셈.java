import java.util.stream.IntStream;

class Solution {
  public static int solution(int a, int b) {
    return  IntStream.range(a, b + 1).map(e -> countYaksu(e) % 2 == 0 ? e : -e).sum();
  }

  private static int countYaksu(int e) {
    int count = 0;
    for (int i = 1; i * i <= e; i++) {
      if (i * i == e) count++; else if (e % i == 0) count += 2;
    }
    return count;
  }
}