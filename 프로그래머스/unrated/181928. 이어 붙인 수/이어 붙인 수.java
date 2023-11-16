class Solution {
    public int solution(int[] num_list) {
    StringBuilder oddSum = new StringBuilder();
    StringBuilder evenSum = new StringBuilder();
    for (int num : num_list) {
      if (num % 2 == 0) {
        evenSum.append(String.valueOf(num));
      } else {
        oddSum.append(String.valueOf(num));
      }
    }

    return (
      Integer.parseInt(evenSum.toString()) + Integer.parseInt(oddSum.toString())
    );
    }
}