import java.util.Scanner;

public class SnakePatternMatrix {

  public static void printSnakePattern(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < cols; j++) {
          System.out.print(matrix[i][j] + " ");
        }
      } else {
        for (int j = cols - 1; j >= 0; j--) {
          System.out.print(matrix[i][j] + " ");
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of rows:");
    int rows = scanner.nextInt();

    System.out.println("Enter the number of columns:");
    int cols = scanner.nextInt();

    int[][] matrix = new int[rows][cols];

    System.out.println("Enter the matrix elements:");

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    System.out.println("Matrix in snake pattern:");
    printSnakePattern(matrix);

    scanner.close();
  }
}
