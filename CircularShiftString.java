import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CircularShiftString {

  public static String circularShift(String s) {
    StringBuilder result = new StringBuilder();
    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (char c : s.toCharArray()) {
      frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }

    for (char c : s.toCharArray()) {
      int frequency = frequencyMap.get(c);
      char shiftedChar = (char) ((c - 'a' + frequency) % 26 + 'a');
      result.append(shiftedChar);
    }

    return result.toString();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string:");
    String inputString = scanner.nextLine();

    String result = circularShift(inputString);

    System.out.println("Modified string: " + result);

    scanner.close();
  }
}
