import java.util.Scanner;

public class MinRowMaxCol {
  public static void findMinRowMaxCol(int[][] mat) {
    int rows = mat.length;
    int cols = mat[0].length;

    for (int i = 0; i < rows; i++) {
      int minInRow = Integer.MAX_VALUE;
      int minColIndex = -1;

      for (int j = 0; j < cols; j++) {
        if (mat[i][j] < minInRow) {
          minInRow = mat[i][j];
          minColIndex = j;
        }
      }

      boolean isMaxInCol = true;

      for (int k = 0; k < rows; k++) {
        if (mat[k][minColIndex] > minInRow) {
          isMaxInCol = false;
          break;
        }
      }

      if (isMaxInCol) {
        System.out.print(minInRow + " ");
      }
    }

    if (mat.length == 0) {
      System.out.println("-1");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of rows in the matrix:");
    int rows = scanner.nextInt();

    System.out.println("Enter the number of columns in the matrix:");
    int cols = scanner.nextInt();

    int[][] matrix = new int[rows][cols];

    System.out.println("Enter the elements of the matrix:");

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    System.out.println("Output:");
    findMinRowMaxCol(matrix);

    scanner.close();
  }
}
