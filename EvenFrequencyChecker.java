import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvenFrequencyChecker {

  public static boolean hasEvenFrequency(String s) {
    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (char c : s.toCharArray()) {
      frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }

    for (int frequency : frequencyMap.values()) {
      if (frequency % 2 != 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string:");
    String inputString = scanner.nextLine();

    boolean result = hasEvenFrequency(inputString);

    if (result) {
      System.out.println("Yes, all characters have even frequency.");
    } else {
      System.out.println("No, not all characters have even frequency.");
    }

    scanner.close();
  }
}
