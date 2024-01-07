import java.util.Scanner;

public class ShortestWordDistance {

  public static int shortestDistance(String[] words, String word1, String word2) {
    int index1 = -1, index2 = -1;
    int minDistance = Integer.MAX_VALUE;

    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(word1)) {
        index1 = i;
      } else if (words[i].equals(word2)) {
        index2 = i;
      }

      if (index1 != -1 && index2 != -1) {
        minDistance = Math.min(minDistance, Math.abs(index1 - index2));
      }
    }

    return minDistance;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of words in the array:");
    int n = scanner.nextInt();
    scanner.nextLine(); // consume the newline character

    String[] words = new String[n];
    System.out.println("Enter the words in the array:");

    for (int i = 0; i < n; i++) {
      words[i] = scanner.nextLine();
    }

    System.out.println("Enter the first word:");
    String word1 = scanner.nextLine();

    System.out.println("Enter the second word:");
    String word2 = scanner.nextLine();

    System.out.println("Output: " + shortestDistance(words, word1, word2));

    scanner.close();
  }
}
