import java.util.StringTokenizer;
// " " 공백문자가 여러개 올경우 split의 경우 오류가 발생합니다 tokenizer의 true 로 사용하시는 걸 추천드립니다.

class Solution {
    public String solution(String s) {
    s = s.toLowerCase();
    StringTokenizer st = new StringTokenizer(s, " ", true);
    System.out.println(st);
    StringBuilder sb = new StringBuilder();
    while (st.hasMoreTokens()) {
      String word = st.nextToken();
      // 만약 단어가 공백이면 그대로 출력해주고
      if (word.equals(" ")) sb.append(word); else {
        //아니라면 첫글자 대문자 변환해주기
        sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));
      }
    }
    return sb.toString();                
    }
} 