import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordsCounts = scanner.nextInt();
        for (int i = 0; i < wordsCounts; i++) {
            String word = scanner.next();
            if (word.length() > 10) {
                String f = word.charAt(0) + Integer.toString(word.length() - 2)
                        + word.charAt(word.length() - 1);
                System.out.println(f);
            } else {
                System.out.println(word);
            }
        }
    }
}
