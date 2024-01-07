import java.util.*;

public class StringCountWithFrequencyAndLength {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of strings in the array:");
    int n = scanner.nextInt();

    String[] arr = new String[n];

    System.out.println("Enter the strings in the array:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.next();
    }

    System.out.println("Enter the value of X:");
    int X = scanner.nextInt();

    System.out.println("Enter the value of Y:");
    int Y = scanner.nextInt();

    int count = countStrings(arr, X, Y);
    System.out.println("Count of strings: " + count);
  }

  static int countStrings(String[] arr, int X, int Y) {
    int count = 0;

    for (String str : arr) {
      Set<Character> charSet = new HashSet<>();
      int frequency = 0;

      for (char ch : str.toCharArray()) {
        if (!charSet.contains(ch)) {
          charSet.add(ch);
          frequency++;
        }
      }

      if (frequency <= X && str.length() >= Y) {
        count++;
      }
    }

    return count;
  }
}
