package search.problems;


public class SentinelSearch {
    public static int sentinelSearch(int[] arr, int target) {
        int n = arr.length;

        // Place the target as a sentinel at the end of the array
        int last = arr[n - 1];
        arr[n - 1] = target;

        int i = 0;
        while (arr[i] != target) {
            i++;
        }

        // Restore the original last element
        arr[n - 1] = last;

        if (i < n - 1 || arr[n - 1] == target) {
            return i;
        } else {
            return -1; // Element not found
        }
    }

    public static void main(String[] args) {
        int[] array = { 3, 7, 1, 5, 9 };
        int target = 5;

        int index = sentinelSearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
