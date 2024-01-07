import java.util.*;

public class UniqueRowsCount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of rows (N) and columns (M) in the matrix:");
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    char[][] matrix = new char[N][M];

    System.out.println("Enter the matrix elements:");

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        matrix[i][j] = scanner.next().charAt(0);
      }
    }

    int uniqueRowsCount = countUniqueRows(matrix);
    System.out.println("Number of unique rows: " + uniqueRowsCount);
    scanner.close();
  }

  static int countUniqueRows(char[][] matrix) {
    Set<String> uniqueRows = new HashSet<>();

    for (char[] row : matrix) {
      StringBuilder rowString = new StringBuilder();

      for (char ch : row) {
        rowString.append(ch);
      }

      uniqueRows.add(rowString.toString());
    }

    return uniqueRows.size();
  }
}
