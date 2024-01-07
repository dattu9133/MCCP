import java.util.Scanner;

public class MaxConsecutiveOnes {
  public static int findmax(int[] nums) {
    int max = 0;
    int cur = 0;

    for (int num : nums) {
      if (num == 1) {
        cur++;
        max = Math.max(max, cur);
      } else {
        cur = 0;
      }
    }

    return max;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();

    int[] nums = new int[n];

    System.out.println("Enter the elements of the array :");

    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    int result = findmax(nums);

    System.out.println("Max consecutive 1s: " + result);

    scanner.close();
  }
}
