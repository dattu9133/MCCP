import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodPairs {

  public static int numIdenticalPairs(int[] nums) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    int goodPairs = 0;

    for (int num : nums) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    for (int frequency : frequencyMap.values()) {
      goodPairs += (frequency * (frequency - 1)) / 2;
    }

    return goodPairs;
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

    int result = numIdenticalPairs(nums);
    System.out.println("Output: " + result);

    scanner.close();
  }
}
