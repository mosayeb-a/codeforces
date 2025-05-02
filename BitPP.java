import java.util.Scanner;

public class BitPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int statementCount = scanner.nextInt();
        int x = 0;
        for (int i = 0; i < statementCount; i++) {
            String s = scanner.next();
            if (s.charAt(0) == '+') {
                ++x;
            } else if (s.charAt(0) == '-') {
                --x;
            } else if (s.charAt(s.length() - 1) == '+') {
                x++;
            } else if (s.charAt(s.length() - 1) == '-') {
                x--;
            }
        }
        System.out.println(x);
    }
}
