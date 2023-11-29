import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();
    System.out.println(solution(a,b));
    }

    public static double solution(String a, String b) {
        int count = Integer.parseInt(a);
        String[] strArr = b.split(" ");
        int[] scoreArr = new int[count];
        for(int i =0; i < count; i++){
            scoreArr[i]= Integer.parseInt(strArr[i]);
        }
        Arrays.sort(scoreArr);
        BigDecimal highestScore = new BigDecimal(scoreArr[count-1]);
        double newScoreSum = 0;
        for(int i =0; i < count; i++){
            newScoreSum += (new BigDecimal(scoreArr[i]).divide(highestScore, MathContext.DECIMAL128)).doubleValue() * 100;
        }
        double answer = new BigDecimal(newScoreSum).divide(new BigDecimal(count),MathContext.DECIMAL128).doubleValue();
        return  answer;
    }
}