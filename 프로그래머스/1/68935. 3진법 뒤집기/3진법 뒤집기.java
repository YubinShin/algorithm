class Solution {
    public int solution(int n) {
        return Integer.valueOf(ternaryToDecimal(convertToTernaryReverse(n)));

    }
    
  public String convertToTernaryReverse(int number) {
    if (number == 0) {
      return "0";
    }

    StringBuilder ternary = new StringBuilder();
    while (number > 0) {
      ternary.insert(0, number % 3);
      number /= 3;
    }

    StringBuilder result = new StringBuilder();
    for (int i = ternary.length() - 1; i >= 0; i--) {
      result.append(ternary.charAt(i));
    }

    return result.toString();
  }

  public int ternaryToDecimal(String ternary) {
    int decimal = 0;
    int length = ternary.length();
    for (int i = 0; i < length; i++) {
      int digit = Character.getNumericValue(ternary.charAt(i));
      decimal += digit * Math.pow(3, length - 1 - i);
    }
    return decimal;
  }
}