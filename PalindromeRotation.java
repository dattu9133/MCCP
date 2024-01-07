import java.util.Scanner;

public class PalindromeRotation {
  public static boolean isRotationOfPalindrome(String str) {
    int n = str.length();
    if (n < 2) {
      return true; 
    }

    for (int i = 0; i < n; i++) {
      String rotatedStr = str.substring(i) + str.substring(0, i);
      if (isPalindrome(rotatedStr)) {
        return true;
      }
    }

    return false;
  }

  private static boolean isPalindrome(String str) {
    int left = 0, right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string:");
    String inputString = scanner.nextLine();

    boolean result = isRotationOfPalindrome(inputString);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
