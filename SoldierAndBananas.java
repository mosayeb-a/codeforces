
import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        int numberOfDollars = scanner.nextInt();
        int bananasCount = scanner.nextInt();

        int totalCost = 0;
        for (int i = 1; i < bananasCount + 1; i++) {
            totalCost += cost * i;
        }
        int borrowAmount = Math.max(0, totalCost - numberOfDollars);
        System.out.println(borrowAmount);
    }
}