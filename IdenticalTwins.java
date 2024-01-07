import java.util.*;

public class IdenticalTwins {
  public static int countIdenticalTwins(int[] nums) {
    int count = 0;
    Map<Integer, List<Integer>> hm = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (!hm.containsKey(num)) {
        hm.put(num, new ArrayList<>());
      }
      hm.get(num).add(i);
    }

    for (List<Integer> indexes : hm.values()) {
      int size = indexes.size();
      count += (size * (size - 1)) / 2;
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();

    int[] nums = new int[n];

    System.out.println("Enter the elements of the array:");

    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    int result = countIdenticalTwins(nums);

    System.out.println("Number of Identical Twins: " + result);

    scanner.close();
  }
}
