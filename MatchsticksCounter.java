import java.util.Scanner;

public class MatchsticksCounter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String userInput = scanner.nextLine();

    System.out.println("Count of matchsticks for " + userInput + ": " + countMatchsticks(userInput));
     scanner.close();
  }

  static int countMatchsticks(String str) {
    int count = 0;

    for (char ch : str.toCharArray()) {
      switch (ch) {
        case 'A', 'D', 'O', 'P', 'Q', 'R':
          count += 6;
          break;
        case 'B':
          count += 7;
          break;
        case 'C', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z':
          count += 4;
          break;
        case '1':
          count += 2;
          break;
        case '2', '3':
          count += 5;
          break;
        case '4':
          count += 4;
          break;
        case '5', '6', '9':
          count += 6;
          break;
        case '7':
          count += 3;
          break;
        case '8':
          count += 7;
          break;
      }
    }

    return count;
  }
}
