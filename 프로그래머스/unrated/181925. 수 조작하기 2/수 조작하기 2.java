class Solution {
    public String solution(int[] numLog) {
    int init = numLog[0];
    StringBuilder str = new StringBuilder();
    int[] copyLog = new int[numLog.length - 1];

    System.arraycopy(numLog, 1, copyLog, 0, numLog.length - 1);

    for (int num : copyLog) {
      if (num == init + 1) {
        init += 1;
        str.append("w");
      } else if (num == init - 1) {
        init -= 1;
        str.append("s");
      } else if (num == init + 10) {
        init += 10;
        str.append("d");
      } else if (num == init - 10) {
        init -= 10;
        str.append("a");
      } else {}
    }

    return str.toString();
    }
}