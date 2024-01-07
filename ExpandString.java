import java.util.Stack;
import java.util.Scanner;

public class ExpandString {
    public static String expandString(String str) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '(') {
                countStack.push(count);
                strStack.push(currentStr);
                count = 0;
                currentStr = new StringBuilder();
            } else if (ch == ')') {
                int repeatCount = countStack.pop();
                StringBuilder previousStr = strStack.pop();

                for (int i = 0; i < repeatCount; i++) {
                    previousStr.append(currentStr);
                }

                currentStr = previousStr;
            } else {
                currentStr.append(ch);
            }
        }

        return currentStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to expand:");
        String inputString = scanner.nextLine();

        String result = expandString(inputString);

        System.out.println("Output: " + result);

        scanner.close();
    }
}
