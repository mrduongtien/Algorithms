package search;

public class LinearSearch {

    private static boolean linearSearch(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean result = linearSearch(arr, 0);
        System.out.println(result);
    }
}
