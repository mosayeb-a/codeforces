    import java.util.Scanner;

    public class TheatreSquare {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a = scanner.nextInt();

            long flagstonesAlongN = (n + a - 1) / a;
            long flagstonesAlongM = (m + a - 1) / a;
            long totalFlagstones = flagstonesAlongN * flagstonesAlongM;
            System.out.println(totalFlagstones);
        }
    }
