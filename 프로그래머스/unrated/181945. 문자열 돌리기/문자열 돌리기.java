import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArray = a.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char c : charArray){
            result.append( String.valueOf(c) + "\n");
        }
        System.out.println(result.toString());
    }
}