import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonElementsInRows {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    int rows = scanner.nextInt();
    System.out.print("Enter the number of columns: ");
    int cols = scanner.nextInt();

    int[][] matrix = new int[rows][cols];

    System.out.println("Enter the matrix elements:");

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    findCommonElements(matrix);
     scanner.close();
  }

  static void findCommonElements(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    Map<Integer, Integer> elementFrequency = new HashMap<>();

    for (int j = 0; j < cols; j++) {
      elementFrequency.put(matrix[0][j], 1);
    }

    for (int i = 1; i < rows; i++) {
      Map<Integer, Integer> currentRow = new HashMap<>();

      for (int j = 0; j < cols; j++) {
        int currentElement = matrix[i][j];

        if (elementFrequency.containsKey(currentElement)) {
          currentRow.put(currentElement, currentRow.getOrDefault(currentElement, 0) + 1);
        }
      }

      elementFrequency = currentRow;
    }

    System.out.print("Common Elements in All Rows: ");
    for (Map.Entry<Integer, Integer> entry : elementFrequency.entrySet()) {
      int element = entry.getKey();
      int frequency = entry.getValue();

      if (frequency == rows - 1) {
        System.out.print(element + " ");
      }
    }
  }
}
