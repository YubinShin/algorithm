class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int heightPosOfBoard = board.length - 1;
        int lengthPosOfBoard = board[0].length - 1;

        int[] up = { 0, 0 };
        up[0] = h <= 0 ? -1 : h - 1;
        up[1] = w;

        int[] right = { 0, 0 };
        right[0] = h;
        right[1] = w >= lengthPosOfBoard ? -1 : w + 1;

        int[] down = { 0, 0 };
        down[0] = h >= heightPosOfBoard ? -1 : h + 1;
        down[1] = w;

        int[] left = { 0, 0 };
        left[0] = h;
        left[1] = w <= 0 ? -1 : w - 1;


        int[][] tiles = { up, right, down, left };
        String myTile = board[h][w];

        for (int[] tile : tiles) {
          if (tile[0] != -1 && tile[1] != -1) {
            if (myTile.equals(board[tile[0]][tile[1]])) {
              answer++;
            }
          }
        }
        return answer;
    }
}