import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveEvenFrequencyChars {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string:");
    String str = scanner.nextLine();

    String result = removeEvenFrequencyChars(str);

    System.out.println("Result after removing even frequency characters: " + result);
    scanner.close();
  }

  static String removeEvenFrequencyChars(String str) {
    Map<Character, Integer> charFrequency = new HashMap<>();

    for (char c : str.toCharArray()) {
      charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
    }

    StringBuilder result = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (charFrequency.get(c) % 2 != 0) {
        result.append(c);
      }
    }

    return result.toString();
  }

}
