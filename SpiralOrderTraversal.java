import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralOrderTraversal {
  public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
    ArrayList<Integer> result = new ArrayList<>();

    int top = 0, bottom = A.size() - 1, left = 0, right = A.get(0).size() - 1;
    int direction = 0; 

    while (top <= bottom && left <= right) {
      if (direction == 0) {
        for (int i = left; i <= right; i++) {
          result.add(A.get(top).get(i));
        }
        top++;
      } else if (direction == 1) {
        for (int i = top; i <= bottom; i++) {
          result.add(A.get(i).get(right));
        }
        right--;
      } else if (direction == 2) {
        for (int i = right; i >= left; i--) {
          result.add(A.get(bottom).get(i));
        }
        bottom--;
      } else if (direction == 3) {
        for (int i = bottom; i >= top; i--) {
          result.add(A.get(i).get(left));
        }
        left++;
      }

      direction = (direction + 1) % 4;
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of rows (M):");
    int m = scanner.nextInt();

    System.out.println("Enter the number of columns (N):");
    int n = scanner.nextInt();

    List<ArrayList<Integer>> matrix = new ArrayList<>();

    System.out.println("Enter the elements of the matrix:");

    for (int i = 0; i < m; i++) {
      ArrayList<Integer> row = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        row.add(scanner.nextInt());
      }
      matrix.add(row);
    }

    ArrayList<Integer> result = spiralOrder(matrix);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
