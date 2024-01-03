import java.util.Scanner;

public class ReverseCharacterBridgePattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value of N: ");
    int n = scanner.nextInt();

    printReverseCharacterBridgePattern(n);

    scanner.close();
  }

  public static void printReverseCharacterBridgePattern(int n) {
    for (int i = 0; i < n; i++) {
      char ch = 'A';

      for (int j = 0; j < n - i; j++) {
        System.out.print(ch++);
      }

      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      ch--;

      for (int j = 0; j < n - i; j++) {
        System.out.print(ch--);
      }
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
