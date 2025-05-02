import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int problemsCount = scanner.nextInt();

        int finalN = 0;
        int total = 0;
        for (int i = 0; i < problemsCount; i++) {
            int n = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            total += n + n2 + n3;
            if (total >= 2) {
                finalN++;
            }
            total = 0;
        }
        System.out.println(finalN);
    }
}
