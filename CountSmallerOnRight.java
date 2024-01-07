import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountSmallerOnRight {
  public static List<Integer> countSmaller(int[] arr) {
    int n = arr.length;
    int[] count = new int[n];
    int[] indexes = new int[n];
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      indexes[i] = i;
    }

    mergeSort(arr, indexes, count, 0, n - 1);

    for (int c : count) {
      result.add(c);
    }

    return result;
  }

  private static void mergeSort(int[] arr, int[] indexes, int[] count, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;

      mergeSort(arr, indexes, count, low, mid);
      mergeSort(arr, indexes, count, mid + 1, high);

      merge(arr, indexes, count, low, mid, high);
    }
  }

  private static void merge(int[] arr, int[] indexes, int[] count, int low, int mid, int high) {
    int[] mergedIndexes = new int[high - low + 1];
    int left = low;
    int right = mid + 1;
    int rightCount = 0;

    int k = 0;

    while (left <= mid && right <= high) {
      if (arr[indexes[right]] < arr[indexes[left]]) {
        mergedIndexes[k] = indexes[right];
        rightCount++;
        right++;
      } else {
        mergedIndexes[k] = indexes[left];
        count[indexes[left]] += rightCount;
        left++;
      }
      k++;
    }

    while (left <= mid) {
      mergedIndexes[k] = indexes[left];
      count[indexes[left]] += rightCount;
      left++;
      k++;
    }

    while (right <= high) {
      mergedIndexes[k] = indexes[right];
      right++;
      k++;
    }

    for (int i = 0; i < k; i++) {
      indexes[low + i] = mergedIndexes[i];
    }
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

    List<Integer> result = countSmaller(arr);

    System.out.println("Output: " + result);

    scanner.close();
  }
}
