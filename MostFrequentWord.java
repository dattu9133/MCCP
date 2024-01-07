import java.util.*;

public class MostFrequentWord {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first string S1:");
    String s1 = scanner.nextLine();

    System.out.println("Enter the second string S2:");
    String s2 = scanner.nextLine();

    String result = mostFrequentWord(s1, s2);

    System.out.println("The most frequent word not present in S2 is: " + result);
  }

  static String mostFrequentWord(String s1, String s2) {
    Map<String, Integer> frequencyMap = new HashMap<>();

    String[] words = s1.split("\\s+");
    for (String word : words) {
      frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
    }

    words = s2.split("\\s+");
    for (String word : words) {
      frequencyMap.remove(word);
    }

    String mostFrequent = "";
    int maxFrequency = 0;

    for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
      String currentWord = entry.getKey();
      int currentFrequency = entry.getValue();

      if (currentFrequency > maxFrequency
          || (currentFrequency == maxFrequency && currentWord.compareTo(mostFrequent) < 0)) {
        mostFrequent = currentWord;
        maxFrequency = currentFrequency;
      }
    }

    return mostFrequent;
  }
}
