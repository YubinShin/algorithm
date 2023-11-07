import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
  }
}

class Solution {

  public String solution(String rny_string) {
    StringBuilder result = new StringBuilder();
    List<Character> list = new ArrayList<>();

    for (int i = 0; i < rny_string.length(); i++) {
      if (rny_string.charAt(i) == 'm') {
        list.add('r');
        list.add('n');
      } else {
        list.add(rny_string.charAt(i));
      }
    }

    for (Character c : list) {
      result.append(c);
    }

    return result.toString();
  }
}
