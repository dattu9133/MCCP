import java.util.Scanner;

public class ArrayGCD {
  public static int findGCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static int findArrayGCD(int[] arr) {
    int result = arr[0];
    for (int i = 1; i < arr.length; i++) {
      result = findGCD(result, arr[i]);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements of the array:");

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int result = findArrayGCD(arr);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
