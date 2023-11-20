import java.util.Arrays;
class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split("")).sorted().reduce("", (a, b) -> b + a)
;
    }
}