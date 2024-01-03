import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        boolean isPangram = checkPangram(str);

        if (isPangram) {
            System.out.println("The given string is a Pangram.");
        } else {
            System.out.println("The given string is not a Pangram.");
        }

        scanner.close();
    }

    public static boolean checkPangram(String str) {
        Set<Character> alphabetSet = new HashSet<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }

        for (char ch : str.toLowerCase().toCharArray()) {
            alphabetSet.remove(ch);
        }

        return alphabetSet.isEmpty();
    }
}
