import java.util.Scanner;

public class MaxConsecutiveZeroes{
  public static int find(String str, int k) {
    int countOnes = 0;
    int res= 0;

    for (char ch : str.toCharArray()) {
      if (ch == '0') {
        res++;
      } else {
        res= 0;
      }

      countOnes += (ch == '1') ? 1 : 0;
    }

    return (countOnes > 0) ? res* k : 0;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the binary string:");
    String str = scanner.nextLine();

    System.out.println("Enter the value of k (k > 1):");
    int k = scanner.nextInt();

    int result = find(str, k);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
