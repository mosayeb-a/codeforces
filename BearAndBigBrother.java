import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limakWeight = scanner.nextInt();
        int bobWeight = scanner.nextInt();

        int yearCounter = 0;
        while (limakWeight <= bobWeight) {
            limakWeight *= 3;
            bobWeight *= 2;
            yearCounter++;
        }

        System.out.println(yearCounter);
    }
}