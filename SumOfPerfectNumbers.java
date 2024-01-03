import java.util.Scanner;

public class SumOfPerfectNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value of L: ");
    int L = scanner.nextInt();

    System.out.print("Enter the value of R: ");
    int R = scanner.nextInt();

    int result = sumOfPerfectNumbers(L, R);
    System.out.println("Sum of perfect numbers in the range [" + L + ", " + R + "]: " + result);

    scanner.close();
  }

  public static int sumOfPerfectNumbers(int L, int R) {
    int sum = 0;

    for (int i = L; i <= R; i++) {
      if (isPerfectNumber(i)) {
        sum += i;
      }
    }

    return sum;
  }

  public static boolean isPerfectNumber(int num) {
    if (num <= 1) {
      return false;
    }
    int sum = 1; 
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        sum += i;
        if (i != num / i) {
          sum += num / i;
        }
      }
    }

    return sum == num;
  }
}
