import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringFrequencyCount {
  public static int countStrings(String[] arr, int K) {
    int count = 0;

    for (String str : arr) {
      if (isValidString(str, K)) {
        count++;
      }
    }

    return count;
  }

  private static boolean isValidString(String str, int K) {
    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (char ch : str.toCharArray()) {
      frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);

      if (frequencyMap.get(ch) > K) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of strings in the array:");
    int n = scanner.nextInt();
    scanner.nextLine(); 

    String[] arr = new String[n];

    System.out.println("Enter the strings:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextLine();
    }

    System.out.println("Enter the value of K:");
    int K = scanner.nextInt();

    int result = countStrings(arr, K);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
