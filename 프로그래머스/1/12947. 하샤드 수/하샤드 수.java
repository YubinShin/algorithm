import java.util.List;

class Solution {
    public boolean solution(int x) {
        List<String> strArr = List.of(String.valueOf(x).split(""));
        int answer = strArr.stream().mapToInt(e -> Integer.parseInt(e)).sum();
        return x % answer == 0;
    }
}