import java.util.List;
class Solution {
    public String solution(String[] seoul) {
        List<String> neoSeoul = List.of(seoul);
        int n = neoSeoul.indexOf("Kim");
        String answer = "김서방은 " + Integer.toString(n) + "에 있다";
        return answer;
    }
}