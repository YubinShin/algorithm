class Solution {
    public int solution(String t, String p) {
         // 1 ≤ p의 길이 ≤ 18
    // int 형은 최대 10자리 수까지 쓸 수 있었다 ㄷㄷ

    /*
     * byte:
     * 범위: -128부터 127까지.
     * 최대 3자리 수 (예: 127).
     *
     * short:
     * 범위: -32,768부터 32,767까지.
     * 최대 5자리 수 (예: 32,767).
     *
     * int:
     * 범위: -2,147,483,648부터 2,147,483,647까지.
     * 최대 10자리 수 (예: 2,147,483,647).
     *
     * long:
     * 범위: -9,223,372,036,854,775,808부터 9,223,372,036,854,775,807까지.
     * 최대 19자리 수 (예: 9,223,372,036,854,775,807).
     *
     * double:
     * 약 15-17자리의 유효 숫자
     */

    int answer = 0;
    int pLength = p.length();
    long pValue = Long.valueOf(p);
    int tMp = t.length() - pLength + 1;

    for (int i = 0; i < tMp; i++) {
      String item = t.substring(i, i + pLength);
      if (pValue >= Long.valueOf(item)) {
        answer++;
      }
    }

    return answer;
  }
}