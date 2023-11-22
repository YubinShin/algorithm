class Solution {

  public int solution(int n) {
    int originalCountOfOne = countOneOfBinaryString(n);

    int answer = 0;
    for (int i = 1;; i++) {
      if (originalCountOfOne == countOneOfBinaryString(n + i)) {
        answer = n + i;
        break;
      }
    }
    return answer;
  }

  private int countOneOfBinaryString(int n) {
    int answer = 0;
    char[] strArr = Integer.toBinaryString(n).toCharArray();
    for (char c : strArr) {
      if (c == '1') {
        answer++;
      }
    }
    return answer;
  }
}