class Solution {
  /*
   * 연속된 숫자들의 합
   *
   * 가우스 합 공식
   *
   * n : 합
   * k : 연속된 숫자의 갯수
   * a : 연속된 숫자들 중 가장 작은 숫자, 즉 시작 숫자
   *
   * n = a+(a+1)+(a+2)+⋯+(a+k−1);
   *
   * 🔽
   *
   * n = (k * a) + (k *(k - 1))/2;
   * a = (n / k) - (k−1 / 2);
   *
   */
  public int solution(int n) {
    int answer = 0;

    for (int k = 1; k <= n; k++) {
      for (int a = 1; a <= n / k; a++) {
        int sum = k * a + (k * (k - 1)) / 2;
        if (sum == n) {
          answer++;
          break;
        }
      }
    }
    return answer;
  }
}