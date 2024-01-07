import java.util.Scanner;

public class CountFreeCells {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the size of the matrix (N):");
    int N = scanner.nextInt();

    System.out.println("Enter the number of tasks (K):");
    int K = scanner.nextInt();

    int[][] matrix = new int[N][N];

    System.out.println("Enter the tasks (row and column coordinates) one by one:");

    for (int k = 0; k < K; k++) {
      int r = scanner.nextInt();
      int c = scanner.nextInt();

      performTask(matrix, r, c);
      int freeCellCount = countFreeCells(matrix);
      System.out.print(freeCellCount + " ");
    }

    scanner.close();
  }

  static void performTask(int[][] matrix, int r, int c) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][c - 1] = 1; 
      matrix[r - 1][i] = 1; 
    }
  }

  static int countFreeCells(int[][] matrix) {
    int freeCellCount = 0;
    for (int[] row : matrix) {
      for (int cell : row) {
        if (cell == 0) {
          freeCellCount++;
        }
      }
    }
    return freeCellCount;
  }
}
