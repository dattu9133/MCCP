import java.util.Scanner;

public class PalindromeCheck {
  public static boolean find(String str, int X) {
    int n = str.length();
    if (X > n) {
      return false;
    }

    String firstXChars = str.substring(0, X);
    String rev = new StringBuilder(firstXChars).reverse().toString();

    return firstXChars.equals(rev);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string:");
    String inputString = scanner.nextLine();

    System.out.println("Enter the value of X:");
    int X = scanner.nextInt();

    boolean result = find(inputString, X);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
