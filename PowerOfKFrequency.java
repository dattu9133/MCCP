import java.util.*;

public class PowerOfKFrequency {
  public static void printCharacters(String str, int K) {
    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (char ch : str.toCharArray()) {
      frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }

    TreeSet<Character> result = new TreeSet<>();

    for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
      char ch = entry.getKey();
      int frequency = entry.getValue();

      if (isPowerOfK(frequency, K)) {
        result.add(ch);
      }
    }

    for (char ch : result) {
      System.out.print(ch);
    }
  }

  private static boolean isPowerOfK(int num, int K) {
    while (num > 1) {
      if (num % K != 0) {
        return false;
      }
      num /= K;
    }
    return num == 1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string:");
    String str = scanner.nextLine();

    System.out.println("Enter the value of K:");
    int K = scanner.nextInt();

    System.out.println("Output:");
    printCharacters(str, K);

    scanner.close();
  }
}
