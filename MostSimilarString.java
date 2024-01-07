import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostSimilarString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the reference string:");
    String str = scanner.next();

    System.out.println("Enter the number of strings in the array:");
    int n = scanner.nextInt();

    String[] arr = new String[n];

    System.out.println("Enter the strings in the array:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.next();
    }

    System.out.println(findMostSimilarString(str, arr));

    scanner.close();
  }

  static String findMostSimilarString(String str, String[] arr) {
    int maxMatch = 0;
    String mostSimilarString = "";

    for (String s : arr) {
      int matchCount = countMatchingCharacters(str, s);

      if (matchCount > maxMatch) {
        maxMatch = matchCount;
        mostSimilarString = s;
      }
    }

    return mostSimilarString;
  }

  static int countMatchingCharacters(String str1, String str2) {
    Map<Character, Integer> charCount = new HashMap<>();

    for (char c : str1.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    int matchCount = 0;

    for (char c : str2.toCharArray()) {
      if (charCount.containsKey(c) && charCount.get(c) > 0) {
        matchCount++;
        charCount.put(c, charCount.get(c) - 1);
      }
    }

    return matchCount;
  }
}
