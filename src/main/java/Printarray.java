public class Printarray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array of integers
        int[] test = {1, 2, 3, 4, 5}; // Another array

        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nArray of test: ");
        for (int element : test) {
            System.out.print(element + " ");
        }
    }
}
