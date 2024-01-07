import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctStringsCount {
  public static int countDistinctStrings(String[] arr) {
    Set<String> distinctStrings = new HashSet<>();

    for (String str : arr) {
      distinctStrings.add(str);
    }

    return distinctStrings.size();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of strings in the array:");
    int n = scanner.nextInt();
    scanner.nextLine(); 
    String[] arr = new String[n];

    System.out.println("Enter the strings:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextLine();
    }

    int result = countDistinctStrings(arr);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
