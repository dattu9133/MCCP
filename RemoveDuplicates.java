import java.util.*;

public class RemoveDuplicates {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string:");
    String input = scanner.nextLine();

    String result = removeDuplicates(input);

    System.out.println("String after removing duplicates: " + result);
    scanner.close();
  }

  static String removeDuplicates(String input) {
    LinkedHashMap<Character, Integer> lastOccurrences = new LinkedHashMap<>();

    for (int i = input.length() - 1; i >= 0; i--) {
      char currentChar = input.charAt(i);
      lastOccurrences.putIfAbsent(currentChar, i);
    }

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (lastOccurrences.get(currentChar) == i) {
        result.append(currentChar);
      }
    }

    return result.toString();
  }

}
