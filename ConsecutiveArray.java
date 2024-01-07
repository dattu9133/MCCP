import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConsecutiveArray {
  public static boolean areElementsConsecutive(int[] arr) {
    int n = arr.length;
    if (n < 1) {
      return false;
    }

    Set<Integer> uniqueElements = new HashSet<>();
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    for (int num : arr) {
      if (uniqueElements.contains(num)) {
        return false;
      }

      uniqueElements.add(num);
      min = Math.min(min, num);
      max = Math.max(max, num);
    }

    return (max - min + 1) == n;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements of the array:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    boolean result = areElementsConsecutive(arr);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
