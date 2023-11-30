import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] numbersArr = new int[n];
        int[] prefixSum = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbersArr[i] = Integer.parseInt(st.nextToken());
            prefixSum[i] = i == 0 ? numbersArr[i] : prefixSum[i - 1] + numbersArr[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int number = 0; number < m; number++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int sum = getRangeSum(prefixSum, i, j);
            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getRangeSum(int[] prefixSum, int i, int j) {
        if (i == 1) {
            return prefixSum[j - 1];
        } else {
            return prefixSum[j - 1] - prefixSum[i - 2];
        }
    }
}


//네, 대량의 입력 데이터를 처리할 때 `BufferedReader`와 `StringTokenizer`가 `Scanner`와 `split` 메소드보다 성능상 이점을 제공합니다. 이는 특히 알고리즘 문제를 푸는 데 있어서 중요한 요소가 될 수 있습니다. 각각의 차이점을 살펴보겠습니다.
//
//        ### BufferedReader vs Scanner
//        - **속도**: `BufferedReader`는 `Scanner`보다 빠릅니다. `Scanner`는 정규 표현식을 사용하여 입력을 파싱하기 때문에 추가적인 오버헤드가 발생합니다.
//        - **메모리 사용**: `BufferedReader`는 보통 `Scanner`보다 적은 메모리를 사용합니다.
//        - **사용 용이성**: `Scanner`는 사용하기 더 편리하며 직관적인 API를 제공합니다. 하지만, 알고리즘 문제 해결과 같이 성능이 중요한 상황에서는 `BufferedReader`의 사용이 권장됩니다.
//
//        ### StringTokenizer vs split
//        - **속도**: `StringTokenizer`는 `split` 메소드보다 일반적으로 빠릅니다. `split` 메소드는 정규 표현식을 사용하고 결과를 배열로 반환하는 반면, `StringTokenizer`는 단순한 문자열 분석을 수행합니다.
//        - **메모리 사용**: `StringTokenizer`는 필요한 만큼만 메모리를 사용하여 토큰을 생성합니다. `split`은 전체 결과를 배열로 한 번에 저장하므로, 큰 데이터 세트를 다룰 때 메모리 사용량이 더 높을 수 있습니다.
//
//        대규모 입력 데이터를 처리하거나 시간 제한이 엄격한 알고리즘 문제에서는 `BufferedReader`와 `StringTokenizer`를 사용하는 것이 좋습니다. 그러나 코드의 간결성과 가독성이 더 중요한 상황에서는 `Scanner`와 `split` 메소드를 사용하는 것이 편리할 수 있습니다.