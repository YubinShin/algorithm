class Solution {
    public int solution(int n, String control) {
    char[] charArray = control.toCharArray();
    for (char cha : charArray) {
      switch (cha) {
        case 'w':
          n += 1;
          break;
        case 's':
          n -= 1;
          break;
        case 'd':
          n += 10;
          break;
        case 'a':
          n -= 10;
          break;
        default:
          break;
      }
    }

    return n;
    }
}