import java.util.Scanner;

public class StringEncryption {
  public static String encryptString(String str) {
    StringBuilder result = new StringBuilder();
    int n = str.length();

    for (int i = 0; i < n; i++) {
      char ch = str.charAt(i);

      for (int j = 0; j < i + 1; j++) {
        result.append(ch);
      }
    }

    return result.toString();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string to encrypt:");
    String inputString = scanner.nextLine();

    String result = encryptString(inputString);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
