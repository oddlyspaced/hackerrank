import java.util.Scanner;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String words[] = new String[s.length() - 1];
        int index = 0;
        for (int i = 0; i < s.length() - k + ((k == 1)?0:1); i++) {
            words[index++] = s.substring(i, i+k);
        }

        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index; j++) {
                if (words[i].compareTo(words[j]) < 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        return words[0] + "\n" + words[index-1];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}