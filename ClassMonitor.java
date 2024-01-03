import java.util.*;

public class ClassMonitor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();

    int[] A = new int[size];

    System.out.println("Enter the voting IDs of the students:");
    for (int i = 0; i < size; i++) {
      A[i] = scanner.nextInt();
    }

    int res = findClassMonitorCandidate(A);
    System.out.println("Class monitor candidate ID: " + res);

    scanner.close();
  }

  public static int findClassMonitorCandidate(int[] A) {
    int n = A.length;

    Map<Integer, Integer> hm = new HashMap<>();
    for (int id : A) {
      hm.put(id, hm.getOrDefault(id, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
      if (entry.getValue() > n / 2) {
        return entry.getKey();
      }
    }

    return -1;
  }
}