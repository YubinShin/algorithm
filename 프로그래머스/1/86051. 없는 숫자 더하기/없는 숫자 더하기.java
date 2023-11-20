import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Solution {
    public int solution(int[] numbers) {
        List<Integer> arrList = new ArrayList<>(
          Arrays.stream(numbers).boxed().collect(Collectors.toList())
        );

        return IntStream.range(0, 10).filter(e -> !arrList.contains(e)).sum();
    }
}