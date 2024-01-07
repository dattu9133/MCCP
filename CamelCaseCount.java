import java.util.Scanner;

public class CamelCaseCount {
    public static int countCamelCaseCharacters(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        int result = countCamelCaseCharacters(inputString);

        System.out.println("Output: " + result);

        scanner.close();
    }
}
