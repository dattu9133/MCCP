import java.util.*;

public class MthLeastOccurringElement {
  public static void mthLeastOccurringElement(int[] arr, int m) {
    Map<Integer, Integer> hm = new HashMap<>();
    for (int num : arr) {
      hm.put(num, hm.getOrDefault(num, 0) + 1);
    }
    System.out.print("Mth least occurring element for M = " + m + ": ");
    int c = 0;
    for (int x : hm.keySet()) {
      if (hm.get(x) >= m) {
        System.out.print(x + " ");
        c++;
      }
    }
    if (c == 0) {
      System.out.println("No such element.");
    }
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

    System.out.print("Enter the value of M: ");
    int m = scanner.nextInt();

    mthLeastOccurringElement(arr, m);

    scanner.close();
  }
}
