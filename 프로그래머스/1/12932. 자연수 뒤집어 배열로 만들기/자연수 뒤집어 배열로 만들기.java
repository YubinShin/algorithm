class Solution {
    public int[] solution(long n) {
    int[] intArr = new int[String.valueOf(n).length()];
    String[] strArr = String.valueOf(n).split("");
    for (int i = intArr.length; i > 0; i--) {
      System.out.println(intArr.length - 1);
      intArr[i - 1] = Integer.valueOf(strArr[intArr.length - i]);
    }

    return intArr;
    }
}