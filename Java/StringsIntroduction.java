// https://www.hackerrank.com/challenges/java-strings-introduction/problem
import java.util.Scanner;
class StringsIntroduction {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        System.out.println(a.length() + b.length());
        if (a.charAt(0) > b.charAt(0)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(a.charAt(0)) + a.substring(1) + " " + Character.toUpperCase(b.charAt(0)) + b.substring(1));
    }
}