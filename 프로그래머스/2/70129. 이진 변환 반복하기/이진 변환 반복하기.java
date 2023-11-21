class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        String now = new String(s);
        while (!now.equals("1")) {
          zeroCount += now.chars().filter(c -> c == '0').count();
          now = now.replaceAll("0", "");
          now = Integer.toBinaryString(now.length());
          count++;
        }
        System.out.println(count + ", " + zeroCount);
        return new int[] { count, zeroCount };
    }
}