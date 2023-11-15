class Solution {
  public static int solution(int a, int b) {
    String intA = Integer.toString(a);
    String intB = Integer.toString(b);
    int ab = Integer.valueOf(intA + intB);
    int ba = Integer.valueOf(intB + intA);
    return Math.max(ab, ba);
  }
}