package search.ex;

public class Ex2 {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            quickSort(arr, p + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int target = arr[right];
        int i = left;
        for (int j = left; j <= right; j++) {
            if (arr[j] < target) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int current = arr[i];
        arr[i] = arr[right];
        arr[right] = current;
        return i;
    }

    private static boolean binarySearch(int[] arr, int left, int right, int target) {
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

    private static void display(int[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 4, 3, 7, 6, 5};
        System.out.println("----------------- Current list -----------------");
        display(arr);

/*        System.out.println("----------------- Insertion Sort -----------------");
        insertionSort(arr);
        display(arr);*/

        System.out.println("----------------- Quick Sort -----------------");
        quickSort(arr, 0, arr.length - 1);
        display(arr);

        System.out.println("----------------- Binary Search -----------------");
        boolean check = binarySearch(arr, 0, arr.length - 1, 6);
        System.out.println(check);
    }
}
