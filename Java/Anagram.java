import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char aChars[] = a.toLowerCase().toCharArray();
        char bChars[] = b.toLowerCase().toCharArray();

        if (aChars.length != bChars.length)
        return false;

        for (int i = 0; i < aChars.length; i++) {
            for (int j = 0; j < aChars.length; j++) {
                if (aChars[i] < aChars[j]) {
                    char temp = aChars[i];
                    aChars[i] = aChars[j];
                    aChars[j] = temp;
                }
                if (bChars[i] < bChars[j]) {
                    char temp = bChars[i];
                    bChars[i] = bChars[j];
                    bChars[j] = temp;
                }
            }
        }

        for (int i = 0; i < aChars.length; i++) {
            if (aChars[i] != bChars[i])
            return false;
        }
        return true;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}