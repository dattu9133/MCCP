import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OddFrequencySumInMatrix {

  public static int oddFrequencySum(int[][] mat) {
    int sum = 0;
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int[] row : mat) {
      for (int element : row) {
        frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        sum += entry.getKey();
      }
    }

    return sum;
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

    int result = oddFrequencySum(matrix);

    System.out.println("Sum of odd frequency elements: " + result);

    scanner.close();
  }
}
