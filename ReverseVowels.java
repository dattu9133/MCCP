import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseVowels {
  public static String reverseVowels(String s) {
    char[] chars = s.toCharArray();
    Set<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    vowels.add('A');
    vowels.add('E');
    vowels.add('I');
    vowels.add('O');
    vowels.add('U');

    int i = 0, j = chars.length - 1;

    while (i < j) {
      while (i < j && !vowels.contains(chars[i])) {
        i++;
      }

      while (i < j && !vowels.contains(chars[j])) {
        j--;
      }

      if (i < j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        i++;
        j--;
      }
    }

    return new String(chars);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string:");
    String inputString = scanner.nextLine();

    System.out.println("Input: " + inputString);
    System.out.println("Output: " + reverseVowels(inputString));

    scanner.close();
  }
}
