import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int strLength = Integer.parseInt(st.nextToken());
        int pwLength = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bufferedReader.readLine());
        String tempStr = st.nextToken();
        char[] temp = tempStr.toCharArray();

        int[] condArr = new int[4];
        st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < 4; i++) {
            condArr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int[] countArr = new int[4];

        // 초기 윈도우 설정
        for (int i = 0; i < pwLength; i++) {
            countArr[charToIndex(temp[i])]++;
        }

        for (int startIndex = 0; startIndex <= strLength - pwLength; startIndex++) {
            if (isValid(countArr, condArr)) {
                count++;
            }

            // 슬라이딩 윈도우 업데이트: 오래된 문자 제거, 새 문자 추가
            // 이게 굉장히 중요하다
            if (startIndex + pwLength < strLength) {
                countArr[charToIndex(temp[startIndex])]--;
                countArr[charToIndex(temp[startIndex + pwLength])]++;
            }
        }
        System.out.println(count);
    }

    private static int charToIndex(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return -1;
        }
    }

    private static boolean isValid(int[] countArr, int[] condArr) {
        for (int i = 0; i < 4; i++) {
            if (countArr[i] < condArr[i]) {
                return false;
            }
        }
        return true;
    }
}
