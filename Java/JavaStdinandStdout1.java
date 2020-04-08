// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
import java.util.Scanner;
public class JavaStdinandStdout1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + "\n" + b + "\n" + c);
        scanner.close();
    }
 }