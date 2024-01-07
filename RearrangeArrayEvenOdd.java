import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayEvenOdd {
  public static void rearrangeArray(int[] arr) {
    Arrays.sort(arr);

    int n = arr.length;
    int[] result = new int[n];

    int evenIndex = 0, oddIndex = n - 1;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        result[i] = arr[evenIndex++];
      } else {
        result[i] = arr[oddIndex--];
      }
    }

    System.arraycopy(result, 0, arr, 0, n);
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

    rearrangeArray(arr);

    System.out.println("Output: " + Arrays.toString(arr));

    scanner.close();
  }
}
