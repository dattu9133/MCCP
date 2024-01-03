import java.util.*;

public class KthMostOccurringElement {
  public static int kthMostOccurringElement(int[] arr, int k) {
    Map<Integer, Integer> hm = new HashMap<>();

    for (int num : arr) {
      hm.put(num, hm.getOrDefault(num, 0) + 1);
    }

    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
    list.sort((a, b) -> b.getValue() - a.getValue());

    int count = 1;
    System.out.println(list);
    for (Map.Entry<Integer, Integer> entry : list) {
      if (count == k) {
        return entry.getKey();
      }
      count++;
    }

    return -1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();

    int[] arr = new int[size];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.print("Enter the value of K: ");
    int k = scanner.nextInt();

    int result = kthMostOccurringElement(arr, k);
    System.out.println("Kth most occurring element for K = " + k + ": " + result);
    scanner.close();
  }
}
