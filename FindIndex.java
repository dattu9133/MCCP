import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students (N): ");
        int N = scanner.nextInt();

        int[] A = new int[N];

        System.out.println("Enter the marks of the students:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();
        int result = findIndex(A, K);
        System.out.println("Index of the student with marks " + K + " : " + result);

        scanner.close();
    }

    public static int findIndex(int[] A, int K) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == K) {
                return i;
            }
        }

        return -1;
    }
}
