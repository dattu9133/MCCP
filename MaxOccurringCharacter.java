import java.util.*;

public class MaxOccurringCharacter {
  public static boolean checkMaxOccurrence(String s1, String s2) {
    Map<Character, Integer> charCount = new HashMap<>();
    for (char ch : s1.toCharArray()) {
      charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
    }

    char maxChar = ' ';
    int maxCount = 0;
    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxChar = entry.getKey();
        maxCount = entry.getValue();
      }
    }

    
    int countInS2 = 0;
    for (char ch : s2.toCharArray()) {
      if (ch == maxChar) {
        countInS2++;
      }
    }

    return maxCount == countInS2;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first string:");
    String s1 = scanner.nextLine();

    System.out.println("Enter the second string:");
    String s2 = scanner.nextLine();

    boolean result = checkMaxOccurrence(s1, s2);

    System.out.println("Output: " + (result ? "Yes" : "No"));

    scanner.close();
  }
}
