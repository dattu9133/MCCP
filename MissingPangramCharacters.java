import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class MissingPangramCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine().toLowerCase(); 
        Set<Character> alphabetSet = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            alphabetSet.remove(ch);
        }
        System.out.println("Missing characters to make a Pangram:");
        for (char missingChar : alphabetSet) {
            System.out.print(missingChar);
        }

        scanner.close();
    }
}
