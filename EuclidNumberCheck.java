import java.util.Scanner;

public class EuclidNumberCheck {

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static long productOfPrimes(int n) {
    int count = 0;
    int num = 2;
    long product = 1;

    while (count < n) {
      if (isPrime(num)) {
        product *= num;
        count++;
      }
      num++;
    }
    
    return product;
  }

  public static boolean isEuclidNumber(int num) {
    int n = 1;

    while (true) {
      long euclidNumber = productOfPrimes(n) + 1;

      if (euclidNumber == num) {
        return true;
      } else if (euclidNumber > num) {
        return false;
      }

      n++;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number to check if it's a Euclid Number: ");
    int num = scanner.nextInt();

    if (isEuclidNumber(num)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

    scanner.close();
  }
}
