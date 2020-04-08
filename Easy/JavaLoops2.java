import java.util.Scanner;
import java.math.*;
class JavaLoops2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int sum = a;
            // 2 6 14 30 62 126 254 510 1022 2046
            // 4 8 16 32 64 128 256 512 1024 2048 - op
            for (int j = 0; j < c; j++) {
                sum = sum + (int)Math.pow(2, j)*b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}