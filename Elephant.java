
import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coordinate = scanner.nextInt();

        int steps = coordinate / 5;
        if (coordinate % 5 != 0) {
            steps++;
        }
        System.out.println(steps);
        }
}