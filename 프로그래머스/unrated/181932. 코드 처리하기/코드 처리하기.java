class Solution {
    public String solution(String code) {
  int mode = 0;
    String[] codeArr = code.split("");
    StringBuilder ret = new StringBuilder();

    for (int i = 0; i < codeArr.length; i++) {
      if (mode == 0) {
        if (codeArr[i].equals("1")) {
          mode = 1;
        } else {
          if (i % 2 == 0) {
            ret.append(codeArr[i]);
          }
        }
      } else if (mode == 1) {
        if (codeArr[i].equals("1")) {
          mode = 0;
        } else {
          if (i % 2 != 0) {
            ret.append(codeArr[i]);
          }
        }
      }
    }
    return ret.length() > 0 ? ret.toString() : "EMPTY";}
}