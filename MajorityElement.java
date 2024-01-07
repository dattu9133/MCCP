import java.util.Scanner;

public class MajorityElement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the sorted array (space-separated):");
    String[] input = scanner.nextLine().split(" ");

    int[] nums = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      nums[i] = Integer.parseInt(input[i]);
    }

    int majorityElement = findMajorityElement(nums);

    System.out.println("Element with frequency greater than or equal to n/2: " + majorityElement);
     scanner.close();
  }

  static int findMajorityElement(int[] nums) {
    int n = nums.length;
    int candidate = nums[0];
    int count = 1;

    for (int i = 1; i < n; i++) {
      if (nums[i] == candidate) {
        count++;
      } else {
        count--;
      }

      if (count == 0) {
        candidate = nums[i];
        count = 1;
      }
    }

    count = 0;
    for (int num : nums) {
      if (num == candidate) {
        count++;
      }
    }

    if (count >= n / 2) {
      return candidate;
    } else {
      return -1;
    }
  }
}
