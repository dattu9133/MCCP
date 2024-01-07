import java.util.Scanner;

public class SpecialElement {
  public static int find(int[] A) {
    int n = A.length;

    int[] maxOnLeft = new int[n];
    int[] minOnRight = new int[n];

    int maxLeft = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      maxOnLeft[i] = maxLeft;
      maxLeft = Math.max(maxLeft, A[i]);
    }

    int minRight = Integer.MAX_VALUE;
    for (int i = n - 1; i >= 0; i--) {
      minOnRight[i] = minRight;
      minRight = Math.min(minRight, A[i]);
    }

    for (int i = 1; i < n - 1; i++) {
      if (A[i] > maxOnLeft[i] && A[i] < minOnRight[i]) {
        return 1;
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = scanner.nextInt();

    int[] A = new int[n];

    System.out.println("Enter the elements of the array:");

    for (int i = 0; i < n; i++) {
      A[i] = scanner.nextInt();
    }

    int result = find(A);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
