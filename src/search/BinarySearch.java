package search;

import java.util.Arrays;

public class BinarySearch {

    public static boolean binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, right, target);
            } else {
                return binarySearch(arr, left, mid - 1, target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // phai duoc sort truoc khi su dung
        int[] arr = {1, 6, 7, 4, 2, 5, 9, 8};
        Arrays.sort(arr);
        boolean result = binarySearch(arr, 0, arr.length - 1, 9);
        System.out.println(result);
    }
}
