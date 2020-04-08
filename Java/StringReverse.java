// https://www.hackerrank.com/challenges/java-string-reverse/problem
import java.util.Scanner;
class StringReverse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();
        StringBuffer sb = new StringBuffer(a);
        sb.reverse();
        if (sb.toString().equals(a)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}