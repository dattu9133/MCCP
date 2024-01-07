import java.util.Scanner;

public class CountStringsNotContainingCharacters {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of strings:");
    int n = scanner.nextInt();

    String[] arr = new String[n];

    System.out.println("Enter the strings:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.next();
    }

    System.out.println("Enter the string str:");
    String str = scanner.next();

    int count = find(arr, str);
    System.out.println("Number of strings not containing any character of " + str + ": " + count);

    scanner.close();
  }

  static int find(String[] arr, String str) {
    int count = 0;

    for (String s : arr) {
      if (!containsAnyCharacter(s, str)) {
        count++;
      }
    }

    return count;
  }

  static boolean containsAnyCharacter(String s, String characters) {
    for (char c : characters.toCharArray()) {
      if (s.contains(String.valueOf(c))) {
        return true;
      }
    }
    return false;
  }
}
