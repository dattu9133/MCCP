import java.util.*;

public class CharacterFrequency {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the string:");
    String str = scanner.nextLine();

    printCharacterFrequency(str);
    scanner.close();
  }

  static void printCharacterFrequency(String str) {
    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (char ch : str.toCharArray()) {
      frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }

    PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> {
      int freqA = frequencyMap.get(a);
      int freqB = frequencyMap.get(b);

      if (freqA == freqB) {
        return Character.compare(b, a);
      }

      return Integer.compare(freqB, freqA);
    });

    maxHeap.addAll(frequencyMap.keySet());

    while (!maxHeap.isEmpty()) {
      char ch = maxHeap.poll();
      System.out.println(ch + " - " + frequencyMap.get(ch));
    }
  }
}
