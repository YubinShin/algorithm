import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;


class Solution {
    public String solution(String s) {
         StringTokenizer st = new StringTokenizer(s, " ", true);
            List<String> result = new ArrayList<>();
            while (st.hasMoreTokens()) {
              String word = st.nextToken();
              result.add(word);
            }

            for (int j = 0; j < result.size(); j++) {
              String str = result.get(j);
              String newStr = "";
              for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i % 2 == 0) {
                  newStr += Character.toUpperCase(str.charAt(i));
                } else {
                  newStr += Character.toLowerCase(str.charAt(i));
                }
                result.set(j, newStr);
              }
            }
            // System.out.println(Arrays.toString(result.toArray()));
            return result.stream().collect(Collectors.joining());
    }
}