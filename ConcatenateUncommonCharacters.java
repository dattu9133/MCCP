import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConcatenateUncommonCharacters {
  public static String find(String s1, String s2) {
    Set<Character> hs = new HashSet<>();

    for (char ch : s1.toCharArray()) {
      if (!s2.contains(String.valueOf(ch))) {
        hs.add(ch);
      }
    }

    for (char ch : s2.toCharArray()) {
      if (!s1.contains(String.valueOf(ch))) {
        hs.add(ch);
      }
    }

    StringBuilder result = new StringBuilder();
    for (char ch : hs) {
      result.append(ch);
    }

    return result.toString();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first string (S1):");
    String s1 = scanner.nextLine();

    System.out.println("Enter the second string (S2):");
    String s2 = scanner.nextLine();

    String result = find(s1, s2);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
