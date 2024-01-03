import java.util.Arrays;
import java.util.Scanner;

public class FindExtraCharacter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first string: ");
    String strA = scanner.nextLine();

    System.out.print("Enter the second string: ");
    String strB = scanner.nextLine();

    char res = findExtraCharacter(strA, strB);
    System.out.println("Extra character in the second string: " + res);

    scanner.close();
  }

  public static char findExtraCharacter(String strA, String strB) {
    char[] charArrayA = strA.toCharArray();
    char[] charArrayB = strB.toCharArray();

    Arrays.sort(charArrayA);
    Arrays.sort(charArrayB);

    for (int i = 0; i < charArrayA.length; i++) {
      if (i == charArrayB.length || charArrayA[i] != charArrayB[i]) {
        return charArrayA[i];
      }
    }

    return '\0';
  }
}
