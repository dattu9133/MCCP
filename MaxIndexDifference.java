import java.util.*;

public class MaxIndexDifference {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the size of the array:");
    int n = scanner.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements of the array:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println("Output: " + maxDifference(arr));
  }

  static int maxDifference(int[] arr) {
    Map<Integer, Integer> firstIndex = new HashMap<>();
    int maxDiff = 0;

    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];

      if (!firstIndex.containsKey(element)) {
        firstIndex.put(element, i);
      } else {
        maxDiff = Math.max(maxDiff, i - firstIndex.get(element));
      }
    }

    return maxDiff;
  }
}
