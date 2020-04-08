//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
import java.util.StringTokenizer;
public class JavaStringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s, " !,?._\'@" );
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}

