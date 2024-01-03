import java.util.Scanner;

public class NameInitials {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the full name: ");
    String fullName = scanner.nextLine();

    String initialsAndSurname = getInitialsAndSurname(fullName);
    System.out.println("Initials and Surname: " + initialsAndSurname);

    scanner.close();
  }

  public static String getInitialsAndSurname(String fullName) {
    StringBuilder result = new StringBuilder();
    String[] parts = fullName.split(" ");

    for (int i = 0; i < parts.length - 1; i++) {
      result.append(parts[i].charAt(0)).append(". ");
    }

    result.append(parts[parts.length - 1]);
    return result.toString();
  }
}
