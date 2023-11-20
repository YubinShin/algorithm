import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        List<List<Integer>> newList = new ArrayList<>();
        int iLimit = arr1.length;
        int jLimit = arr1[0].length;
        for (int i = 0; i < iLimit; i++) {
          List<Integer> neoList = new ArrayList<>();
          for (int j = 0; j < jLimit; j++) {
            neoList.add(arr1[i][j] + arr2[i][j]);
          }
          newList.add(neoList);
        }
        int[][] answer = new int[newList.size()][newList.get(0).size()];
        for (int i = 0; i < newList.size(); i++) {
          for (int j = 0; j < newList.get(i).size(); j++) {
            answer[i][j] = newList.get(i).get(j);
          }
        }
        return answer;
    }
}