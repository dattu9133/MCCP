import java.util.*;

public class HighestFrequencyElement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the size of the array:");
    int N = scanner.nextInt();

    System.out.println("Enter the elements of the array:");
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
    }

    int result = findHighestFrequencyElement(arr);

    System.out.println("The element with the highest frequency is: " + result);
  }

  static int findHighestFrequencyElement(int[] arr) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int element : arr) {
      frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
    }

    int maxFrequencyElement = arr[0];

    for (int element : frequencyMap.keySet()) {
      if (frequencyMap.get(element) > frequencyMap.get(maxFrequencyElement) ||
          (frequencyMap.get(element) == frequencyMap.get(maxFrequencyElement) && element < maxFrequencyElement)) {
        maxFrequencyElement = element;
      }
    }

    return maxFrequencyElement;
  }
}
