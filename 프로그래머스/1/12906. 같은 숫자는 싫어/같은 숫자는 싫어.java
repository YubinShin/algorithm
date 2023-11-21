import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1, j = 0; i < arr.length; i++) {
          if (arr[i] != list.get(j)) {
            list.add(arr[i]);
            j++;
          }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
          answer[i] = list.get(i);
        }
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
}