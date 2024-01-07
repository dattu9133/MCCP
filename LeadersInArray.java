import java.util.*;

public class LeadersInArray {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        int mr = arr[n - 1];
        leaders.add(0, mr);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > mr) {
                mr = arr[i];
                leaders.add(mr);
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> output = findLeaders(arr);

        System.out.println("\nInput: " + Arrays.toString(arr));
        System.out.println("Leaders in the array: " + output);

        scanner.close();
    }
}
