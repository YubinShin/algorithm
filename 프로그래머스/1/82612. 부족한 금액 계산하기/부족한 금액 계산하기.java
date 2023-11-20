class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;

        for (int i = 1; i <= count; i++) {
          total += (long) (price * i);
          System.out.println(total);
        }

        return money < total ? (long) total - money : (long) 0;
    }
}