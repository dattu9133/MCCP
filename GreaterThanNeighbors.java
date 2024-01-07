import java.util.*;

public class GreaterThanNeighbors {
  public static List<Integer> findIndexes(int[] arr) {
    List<Integer> result = new ArrayList<>();
    int n = arr.length;

    if (n > 0 && arr[0] > arr[1]) {
      result.add(0);
    }

    for (int i = 1; i < n - 1; i++) {
      if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
        result.add(i);
      }
    }

    if (n > 1 && arr[n - 1] > arr[n - 2]) {
      result.add(n - 1);
    }

    return result;
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

    List<Integer> output = findIndexes(arr);

    System.out.println("\nInput: " + Arrays.toString(arr));
    System.out.println("Indexes with values greater than neighbors: " + output);

    scanner.close();
  }
}
