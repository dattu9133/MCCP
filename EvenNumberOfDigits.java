import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumberOfDigits {
  public static List<Integer> findEvenDigitNumbers(int[] nums) {
    List<Integer> result = new ArrayList<>();

    for (int num : nums) {
      if (hasEvenDigits(num)) {
        result.add(num);
      }
    }

    return result;
  }

  private static boolean hasEvenDigits(int num) {
    int digitCount = 0;
    while (num != 0) {
      num /= 10;
      digitCount++;
    }

    return digitCount % 2 == 0;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();

    int[] nums = new int[n];

    System.out.println("Enter the elements of the array:");

    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    List<Integer> result = findEvenDigitNumbers(nums);

    System.out.println("Answer: " + result);

    scanner.close();
  }
}
