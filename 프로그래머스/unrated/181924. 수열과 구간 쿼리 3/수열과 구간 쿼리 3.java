class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
          // query[0]와 query[1] 위치의 요소를 교환
          int temp = arr[query[0]];
          arr[query[0]] = arr[query[1]];
          arr[query[1]] = temp;
        }
        return arr;
    }
}