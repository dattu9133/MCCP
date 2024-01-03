import java.util.Scanner;

public class FindInitials {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a name: ");
    String name = scanner.nextLine();

    String initials = findInitials(name);

    System.out.println("Initials: " + initials);

    scanner.close();
  }

  private static String findInitials(String name) {
    StringBuilder res = new StringBuilder();
    String[] names = name.split("\\s+");
    for (String x : names) {
      if (x.length() != 0) {
        res.append(Character.toUpperCase(x.charAt(0))).append(" ");
      }
    }
    return res.toString();
  }
}
