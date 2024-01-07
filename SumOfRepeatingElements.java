import java.util.*;

public class SumOfRepeatingElements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println("Enter the value of k:");
    int k = scanner.nextInt();

    int sum = sumOfRepeatingElements(arr, k);
    System.out.println("Sum of elements repeating " + k + " times: " + sum);
  }

  static int sumOfRepeatingElements(int[] arr, int k) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int num : arr) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    int sum = 0;

    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      if (entry.getValue() == k) {
        sum += entry.getKey();
      }
    }

    return sum;
  }
}
