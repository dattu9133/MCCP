import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountElementsKTimes {
  public static int countElements(int[] arr, int K) {
    int count = 0;
    Map<Integer, Integer> lastIndexMap = new HashMap<>();

    for (int i = arr.length - 1; i >= 0; i--) {
      int num = arr[i];

      if (!lastIndexMap.containsKey(num)) {
        lastIndexMap.put(num, i);
      } else {
        int lastIndex = lastIndexMap.get(num);

        if (lastIndex - i >= K) {
          count++;
        }
      }
    }

    return count;
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

    System.out.println("Enter the value of K:");
    int K = scanner.nextInt();

    int result = countElements(arr, K);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
