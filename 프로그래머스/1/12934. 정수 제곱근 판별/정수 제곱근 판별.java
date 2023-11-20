import java.math.BigDecimal;

class Solution {
  public static long solution(long n) {
        BigDecimal root = new BigDecimal(Math.sqrt(n));
        if (root.equals(root.setScale(0, BigDecimal.ROUND_FLOOR))) {
          BigDecimal single = root.add(new BigDecimal(1));
          return single.multiply(single).longValueExact();
        }
        return -1l;
  }
}