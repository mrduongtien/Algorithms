package search.ex;

public class Ex23 {
    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            quickSort(arr, p + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j <= right; j++) {
            if (arr[j] < pivot) {
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

    private static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, right, target);
            } else {
                return binarySearch(arr, left, mid - 1, target);
            }
        }
        return - 1;
    }

    private static void display(int[] arr) {
        for (var e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 8, 1 , 3 , 0, 7, 7, 2};
//        insertionSort(arr);
//        display(arr);

        quickSort(arr, 0, arr.length - 1);
        int result = binarySearch(arr, 0, arr.length - 1, 8);
        System.out.println(result);
    }
}
