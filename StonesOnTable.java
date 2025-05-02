import java.util.Scanner;

public class StonesOnTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String c = scanner.next();

        int rCount = 0;
        int gCount = 0;
        int bCount = 0;

        for (int i = 1; i < c.length(); i++) {
            if (c.charAt(i) == c.charAt(i - 1)) {
                if (c.charAt(i) == 'R') {
                    rCount++;
                } else if (c.charAt(i) == 'G') {
                    gCount++;
                } else if (c.charAt(i) == 'B') {
                    bCount++;
                }
            }
        }
        int t = rCount + gCount + bCount;
        System.out.println(t);
    }
}