import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordsTwice {
  public static int countWordsTwice(String[] words) {
    Map<String, Integer> hm = new HashMap<>();

    for (String word : words) {
      hm.put(word, hm.getOrDefault(word, 0) + 1);
    }

    int count = 0;
    for (int x : hm.values()) {
      if (x == 2) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of words in the array:");
    int n = scanner.nextInt();

    scanner.nextLine();

    String[] words = new String[n];

    System.out.println("Enter the words in the array:");

    for (int i = 0; i < n; i++) {
      words[i] = scanner.next();
    }

    int result = countWordsTwice(words);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
