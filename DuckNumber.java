import java.util.Scanner;

public class DuckNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    String number = scanner.next();

    boolean isDuck = isDuckNumber(number);

    if (isDuck) {
      System.out.println("It is a duck number.");
    } else {
      System.out.println("It is not a duck number.");
    }

    scanner.close();
  }

  private static boolean isDuckNumber(String number) {
    if (number.charAt(0) == '0') {
      return false;
    }

    // for (char digit : number.toCharArray()) {
    // if (digit == '0') {
    // return true;
    // }
    // }
    String[] parts = number.split("0");
    return parts.length > 1;
  }
}
