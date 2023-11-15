class Solution {
    public String solution(String str1, String str2) {
    StringBuilder answer = new StringBuilder();
    char[] str1Arr = str1.toCharArray();
    char[] str2Arr = str2.toCharArray();
    int a = 0;
    int b = 0;
    for (int i = 0; i < str1.length() + str2.length(); i++) {
      if (i % 2 == 0) {
        answer.append(String.valueOf(str1Arr[a]));
        a++;
      } else {
        answer.append(String.valueOf(str2Arr[b]));
        b++;
      }
    }
    return answer.toString();
    }
}