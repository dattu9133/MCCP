import java.util.*;

public class DifferenceOfArrays {
  public static ArrayList<Integer> findDifference(int[] arr1, int[] arr2) {
    Set<Integer> set = new HashSet<>();
    ArrayList<Integer> result = new ArrayList<>();

    for (int num : arr2) {
      set.add(num);
    }

    for (int num : arr1) {
      if (!set.contains(num)) {
        result.add(num);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the first array:");
    int n1 = scanner.nextInt();
    int[] arr1 = new int[n1];

    System.out.println("Enter the elements of the first array:");

    for (int i = 0; i < n1; i++) {
      arr1[i] = scanner.nextInt();
    }

    System.out.println("Enter the number of elements in the second array:");
    int n2 = scanner.nextInt();
    int[] arr2 = new int[n2];

    System.out.println("Enter the elements of the second array:");

    for (int i = 0; i < n2; i++) {
      arr2[i] = scanner.nextInt();
    }

    ArrayList<Integer> result = findDifference(arr1, arr2);

    System.out.println("Output: " + Arrays.toString(result.toArray()));

    scanner.close();
  }
}
