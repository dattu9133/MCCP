import java.util.Scanner;

public class ModifyMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of rows (M):");
    int M = scanner.nextInt();

    System.out.println("Enter the number of columns (N):");
    int N = scanner.nextInt();

    int[][] matrix = new int[M][N];

    System.out.println("Enter the matrix elements row-wise:");

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    modifyMatrix(matrix);

    System.out.println("Modified Matrix:");
    printMatrix(matrix);

    scanner.close();
  }

  static void modifyMatrix(int[][] matrix) {
    int M = matrix.length;
    int N = matrix[0].length;

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        for (int k = 0; k < M && k < N; k++) {
          if (i + k < M && j + k < N) {
            leftDiagonalSum += matrix[i + k][j + k];
          }
        }

        for (int k = 0; k < M && k < N; k++) {
          if (i + k < M && j - k >= 0) {
            rightDiagonalSum += matrix[i + k][j - k];
          }
        }

        matrix[i][j] = Math.max(leftDiagonalSum, rightDiagonalSum);
      }
    }
  }

  static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int cell : row) {
        System.out.print(cell + " ");
      }
      System.out.println();
    }
  }
}
