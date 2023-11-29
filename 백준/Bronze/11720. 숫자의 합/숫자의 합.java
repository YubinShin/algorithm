import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();
    solution(a,b);
    }

    public static int solution(String a, String b) {
        int length = Integer.parseInt(a);
        char[] arr = b.toCharArray();
        int answer = 0;
        for(int i =0; i < length; i++){
            answer += Character.getNumericValue(arr[i]);
        }
        System.out.println(answer);
        return answer;
    }
}