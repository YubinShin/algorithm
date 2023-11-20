import java.math.BigDecimal;

class Solution {
    public int solution(int num) {
   if (num == 1) {
      return 0;
    }
    BigDecimal bd = new BigDecimal(num);
    for (int count = 0; count < 500;) {
      if (bd.equals(new BigDecimal(1))) {
        return count;
      }
      if (bd.remainder(new BigDecimal(2)).equals(new BigDecimal(0))) {
        bd = bd.divide(new BigDecimal(2));
        count++;
      } else {
        bd = bd.multiply(new BigDecimal(3)).add(new BigDecimal(1));
        count++;
      }
    }
    return -1;
    }
}