import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        int kthPlaceScore = scores[k - 1];
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] >= kthPlaceScore && scores[i] > 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}