import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int count = 1; // 0 + 자기자신
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1; // 초기에는 startIndex만 포함

        // 연속된 수로 sum 을 만드려면 n/2 보다 인덱스들이 작아야한다.
        while(startIndex <= n/2){
            if(sum < n){
                endIndex++;
                sum += endIndex;
            } else if(sum > n) {
                sum -= startIndex;
                startIndex++;
            } else {
                count++;
                sum -= startIndex;
                startIndex++;
            }
        }
        System.out.println(count);
    }
}