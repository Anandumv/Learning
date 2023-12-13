package search.problems;

public class Linearsearch {
    public static int linearSearch(int[] sortedarr, int tobefound) {
        for (int i = 0; i < sortedarr.length; i++) {
            if (sortedarr[i] == tobefound) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] sortedarr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int tobefound = 12;

        int result = linearSearch(sortedarr, tobefound);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
