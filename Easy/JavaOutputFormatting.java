// https://www.hackerrank.com/challenges/java-output-formatting/problem
import java.util.Scanner;
class JavaOutputFormatting {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
    }
}

/*
Notes -
- %-15s means that it would print the provided string 
  while adding enough trailing spaces to make a total
  length of 15 characters
- %03d means that it would add enough number of 0's in
  the start to make a total length of 3
*/