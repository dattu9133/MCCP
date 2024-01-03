import java.util.Scanner;

public class RemovePunctuation {
    public static String removePunctuation(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            // if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch == ' ')) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = removePunctuation(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);

        scanner.close();
    }
}
