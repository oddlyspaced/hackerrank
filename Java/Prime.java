import java.math.BigInteger;
import java.util.Scanner;

public class Prime {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BigInteger integer = new BigInteger(scanner.next());
        scanner.close();
        System.out.println(integer.isProbablePrime(1)?"prime":"not prime");
    }
    
}