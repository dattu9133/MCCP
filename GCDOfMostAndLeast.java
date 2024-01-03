import java.util.*;

public class GCDOfMostAndLeast {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int gcd = find(arr);

    System.out.println("GCD of most occurring and least occurring elements: " + gcd);

    scanner.close();
  }

  private static int find(int[] arr) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int x : arr) {
      hm.put(x, hm.getOrDefault(x, 0));
    }
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int a : hm.keySet()) {
      if (hm.get(a) > max) {
        max = a;
      } else if (hm.get(a) < min) {
        min = a;
      }
    }
    return gcd(min, max);
  }

  private static int gcd(int min, int max) {
    if (max == 0) {
      return min;
    }
    return gcd(max, min % max);
  }
}