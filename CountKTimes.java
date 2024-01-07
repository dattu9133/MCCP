import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountKTimes {
  public static int countElements(int[] arr, int K) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    int count = 0;

    for (int num : arr) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      int num = entry.getKey();
      int frequency = entry.getValue();

      if (frequency == K && !frequencyMap.containsKey(2 * num)) {
        count++;
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
