// https://www.hackerrank.com/challenges/java-stdin-stdout/problem
import java.util.Scanner;
class JavaStdinStdout2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine(); // this clears out the buffer before reading the string line
        String s = scanner.nextLine();
        System.out.println("String: " + s + "\n" + "Double: " + d + "\nInt: " + n);
        scanner.close();
    }
}