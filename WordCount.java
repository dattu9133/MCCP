import java.util.Scanner;

public class WordCount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    int count = countWords(input);
    System.out.println("Number of words in the given string: " + count);

    scanner.close();
  }

  public static int countWords(String str) {
    int count = 0;
    boolean isWord = false;

    for (char ch : str.toCharArray()) {
      if (ch == ' ' || ch == '\n' || ch == '\t') {
        isWord = false;
      } else {
        if (!isWord) {
          count++;
        }
        isWord = true;
      }
    }

    return count;
  }
}
