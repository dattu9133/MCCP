import java.util.Scanner;

public class ReplaceElements {
  public static void replaceWithSquaresAndCubes(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] = (int) Math.pow(arr[i], 2);
      } else {
        arr[i] = (int) Math.pow(arr[i], 3);
      }
    }
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

    replaceWithSquaresAndCubes(arr);

    System.out.println("Updated array:");

    for (int element : arr) {
      System.out.print(element + " ");
    }

    scanner.close();
  }
}
