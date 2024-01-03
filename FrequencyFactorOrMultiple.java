import java.util.*;

public class FrequencyFactorOrMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        String result = checkFrequencyFactorOrMultiple(s1, s2);
        System.out.println(result);

        scanner.close();
    }

    public static String checkFrequencyFactorOrMultiple(String s1, String s2) {
        Map<Character, Integer> frequencyMap1 = getFrequencyMap(s1);
        Map<Character, Integer> frequencyMap2 = getFrequencyMap(s2);

        for (Map.Entry<Character, Integer> entry : frequencyMap1.entrySet()) {
            char ch = entry.getKey();
            int freq1 = entry.getValue();
            int freq2 = frequencyMap2.getOrDefault(ch, 0);

            if (freq1 != 0 && freq2 != 0 && (freq2 % freq1 != 0) && (freq1 % freq2 != 0)) {
              return "NO";
            }
        }

        return "YES";
    }

    public static Map<Character, Integer> getFrequencyMap(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
          frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap;
    }
}