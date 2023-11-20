import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length < 2) {
          return new int[] { -1 };
        }
        int[] copy = arr.clone();
        Arrays.sort(copy);
        return Arrays.stream(arr).filter(e -> e != copy[0]).toArray();
    }
}