
import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = String.valueOf(n);
        String ns = "";
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.length() - 1 == j) {
                    int lastDigit = Character.getNumericValue(s.charAt(j));
                    int num = Integer.parseInt(s);
                    if (lastDigit == 0) {
                        num /= 10;
                    } else {
                        num--;
                    }
                    ns = String.valueOf(num);
                    s = ns;
                }
            }
        }
        System.out.println(ns);
    }
}