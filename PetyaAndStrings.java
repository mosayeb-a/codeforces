import java.util.Scanner;

public class PetyaAndStrings {
    static char[] chars = new char[]{
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstStr = scanner.next().toLowerCase();
        String secStr = scanner.next().toLowerCase();
        if (firstStr.equals(secStr)) {
            System.out.println("0");
        } else if (isAGreaterThanBLexicographically(firstStr, secStr)) {
            System.out.println("1");
        } else{
            System.out.println("-1");
        }
    }

    static boolean isAGreaterThanBLexicographically(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                int indexCharA = getIndexByValue(a.charAt(i));
                int indexCharB = getIndexByValue(b.charAt(i));
                return indexCharA > indexCharB;
            }
        }
        return false;
    }

    static int getIndexByValue(char c) {
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                return i;
            }
        }
        return -1;
    }
}