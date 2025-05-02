import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[6][6];

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    // row:2 col:5
                    // row:3 col:3
                    int middRow = 3;
                    int middCol = 3;
                    int exceptedRow = middRow - i; // 1
                    int exceptedCol = middCol - j; // -2
                    int movesCount = Math.abs(exceptedRow) + Math.abs(exceptedCol);
                    System.out.println(movesCount);
                    break;
                }
            }
        }
    }
}