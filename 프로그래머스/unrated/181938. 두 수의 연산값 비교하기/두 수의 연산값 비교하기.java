class Solution {
    public int solution(int a, int b) {
        String intA = Integer.toString(a);
        String intB = Integer.toString(b);
        int case1 = Integer.valueOf(intA + intB);
        int case2 = 2 * a * b;
        return Math.max(case1, case2);
    }
}