import java.util.Arrays;


class Solution {
    public int[] solution(int[] num_list) {
        int lastItem = num_list[num_list.length - 1];
        int beforeItem = num_list[num_list.length - 2];
        int addItem = 0;

        if (lastItem > beforeItem) {
          addItem = lastItem - beforeItem;
        } else {
          addItem = lastItem * 2;
        }

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[num_list.length] = addItem;
        return answer;
    }
}

//Arrays.copyOf(복사할배열, newLength)