// https://www.hackerrank.com/challenges/java-if-else/problem
import java.util.Scanner;
class JavaIfElse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2 == 1) {
            System.out.println("Weird");
        }
        else {
            if ((n >= 2 && n <= 5) | (n > 20)) {
                System.out.println("Not Weird");
            }
            else {
                System.out.println("Weird");
            }
        }
        scanner.close();
    }
}