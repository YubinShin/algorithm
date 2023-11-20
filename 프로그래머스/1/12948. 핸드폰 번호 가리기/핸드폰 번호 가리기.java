class Solution {
    public String solution(String phone_number) {
    char[] charArr = phone_number.toCharArray();
    int i = 0;
    StringBuffer answer = new StringBuffer();
    for (char c : charArr) {
      if (i < charArr.length - 4) {
        answer.append(String.valueOf("*"));
        i++;
      } else {
        answer.append(String.valueOf(c));
        i++;
      }
    }
    return answer.toString();
    }
}