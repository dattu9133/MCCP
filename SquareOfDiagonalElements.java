import java.util.Scanner;

public class SquareOfDiagonalElements {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the size of the odd matrix (n x n):");
    int n = scanner.nextInt();

    if (n % 2 == 0) {
      System.out.println("Please enter an odd-sized matrix.");
      scanner.close();
      return;
    }

    int[][] matrix = new int[n][n];

    System.out.println("Enter the elements of the matrix:");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    System.out.println("Diagonal one:");

    for (int i = 0; i < n; i++) {
      System.out.print(matrix[i][i] * matrix[i][i] + " ");
    }

    System.out.println("\nDiagonal two:");

    for (int i = 0; i < n; i++) {
      System.out.print(matrix[i][n - i - 1] * matrix[i][n - i - 1] + " ");
    }

    scanner.close();
  }
}
