import java.util.Arrays;


class Solution {
    public long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        StringBuffer answer = new StringBuffer();
        for (String str : strArr) {
          answer.insert(0, str);
        }
        return Long.valueOf(answer.toString());
    }
}