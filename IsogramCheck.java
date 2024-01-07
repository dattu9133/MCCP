import java.util.Scanner;

public class IsogramCheck {

  public static boolean isIsogram(String str) {
    int[] frequency = new int[256];

    for (char ch : str.toCharArray()) {
      if (frequency[ch] > 0) {
        return false; 
      }
      frequency[ch]++;
    }

    return true;
  }

  public static boolean areAllIsograms(String[] arr) {
    for (String str : arr) {
      if (!isIsogram(str)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of strings in the array:");
    int n = scanner.nextInt();
    scanner.nextLine(); // consume the newline character

    String[] arr = new String[n];

    System.out.println("Enter the strings in the array:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextLine();
    }

    boolean result = areAllIsograms(arr);

    if (result) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    scanner.close();
  }
}
