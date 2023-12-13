package search.problems;


public class BinarySearch1  {

    public static int binarysearch(int[] sortedarr , int tobefound){
        int leftindex =0;
        int rightindex= sortedarr.length-1;

        while (leftindex<=rightindex){

            int mid =leftindex+(rightindex-leftindex)/2;
            if (sortedarr[mid] == tobefound) {
                return mid;

            }
            else if (sortedarr[mid] < tobefound ) {
                leftindex = mid + 1;
            } else {
                rightindex= mid -1;
            }
        }
        return  -1;
    }



    public static void main(String[] args) {
        int[] sortedarr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tobefound = 9;

        int index = binarysearch(sortedarr , tobefound);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
