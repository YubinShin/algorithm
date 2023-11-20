import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] strArr = String.valueOf(n).split("");
        int length = strArr.length;
        int answer = 0;
        int i = 0;
        while (i < length) {
          answer += Integer.valueOf(strArr[i]);
          i++;
        }
        return answer;
    }
}