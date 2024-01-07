import java.util.Arrays;
import java.util.Scanner;

public class CumulativeSum {
  public static int[] calculateCumulativeSum(int[] arr) {
    int n = arr.length;

    int[] cumulativeSum = new int[n];

    cumulativeSum[0] = arr[0];
    for (int i = 1; i < n; i++) {
      cumulativeSum[i] = cumulativeSum[i - 1] + arr[i];
    }

    return cumulativeSum;
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

    int[] result = calculateCumulativeSum(arr);

    System.out.println("\nInitial Array: " + Arrays.toString(arr));
    System.out.println("Cumulative Sum: " + Arrays.toString(result));

    scanner.close();
  }
}
