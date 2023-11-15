import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        changeCase(a);
    }
    public static void changeCase(String a){
        StringBuilder result = new StringBuilder();
        char[] charArray = a.toCharArray();
        for(char c : charArray){
            if (c >= 'a' && c <='z'){
                result.append(String.valueOf(c).toUpperCase());
            }else{
                result.append(String.valueOf(c).toLowerCase());
            }
        }
        System.out.println(result.toString());
    }
}