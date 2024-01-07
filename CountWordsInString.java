import java.util.Scanner;

public class CountWordsInString {
  public static int countWords(String[] words, String str) {
    int count = 0;

    String[] strWords = str.split("\\s+");

    for (String word : words) {
      for (String strWord : strWords) {
        if (word.equalsIgnoreCase(strWord)) {
          count++;
          break;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of words in the array:");
    int n = scanner.nextInt();

    scanner.nextLine();

    String[] words = new String[n];

    System.out.println("Enter the words in the array:");

    for (int i = 0; i < n; i++) {
      words[i] = scanner.next();
    }

    System.out.println("Enter the string:");
    String str = scanner.nextLine();

    int result = countWords(words, str);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
