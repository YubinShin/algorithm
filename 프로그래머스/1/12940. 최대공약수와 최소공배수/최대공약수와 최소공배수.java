class Solution {
    public int[] solution(int n, int m) {
    int[] answer = new int[2];
    int a = Math.max(n, m);
    int b = Math.min(n, m);
    for (int i = 1; i <= n; i++) {
      if (a % i == 0 && b % i == 0) {
        answer[0] = i;
      }
    }

    if (b % a == 0) {
      answer[1] = b;
    }

    int maxGonBae = a * b;

    for (int i = 1; i <= b; i++) {
      if (maxGonBae / i % a == 0 && maxGonBae / i % b == 0) {
        System.out.println(maxGonBae / i);
        answer[1] = maxGonBae / i;
      }
    }

    return answer;
    }
}