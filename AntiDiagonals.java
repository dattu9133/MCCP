import java.util.ArrayList;
import java.util.Scanner;

public class AntiDiagonals {
  public static ArrayList<ArrayList<Integer>> findAntiDiagonals(int[][] matrix) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    int n = matrix.length;

    for (int col = 0; col < n; col++) {
      int i = 0;
      int j = col;
      ArrayList<Integer> diagonal = new ArrayList<>();

      while (i < n && j >= 0) {
        diagonal.add(matrix[i][j]);
        i++;
        j--;
      }

      result.add(diagonal);
    }

    for (int row = 1; row < n; row++) {
      int i = row;
      int j = n - 1;
      ArrayList<Integer> diagonal = new ArrayList<>();

      while (i < n && j >= 0) {
        diagonal.add(matrix[i][j]);
        i++;
        j--;
      }

      result.add(diagonal);
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the size of the square matrix (N):");
    int n = scanner.nextInt();

    int[][] matrix = new int[n][n];

    System.out.println("Enter the elements of the matrix:");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    ArrayList<ArrayList<Integer>> result = findAntiDiagonals(matrix);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
