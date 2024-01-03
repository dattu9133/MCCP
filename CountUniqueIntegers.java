import java.util.*;

public class CountUniqueIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int c = countUniqueIntegers(arr);
        System.out.println("Count of unique integers in the array: " + c);

        scanner.close();
    }

    public static int countUniqueIntegers(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int c = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                c++;
            }
        }

        return c;
    }
}
