import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                nums.add(Character.getNumericValue(s.charAt(i)));
            }
        }

        sortNums(nums);
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < nums.size(); i++) {
            finalString.append(nums.get(i));
            if (i < nums.size() - 1) {
                finalString.append("+");
            }
        }
        System.out.println(finalString);
    }

    static void sortNums(List<Integer> nums) {
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }
            }
        }
    }
}