package overview;

public class Sort4 {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }

    public static void quicksort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int p = partition(arr, leftIndex, rightIndex);
            quicksort(arr, leftIndex, p - 1);
            quicksort(arr, p + 1, rightIndex);
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
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }

    private static void printResults(int[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 10, 5, 8, 4, 7};
        System.out.println("-------------- CURRENT DATA --------------");
        printResults(arr);

//        System.out.println("-------------- INSERTION SORT --------------");
//        insertionSort(arr);
//        printResults(arr);
        System.out.println("-------------- QUICK SORT --------------");
        quicksort(arr, 0, arr.length - 1);
        printResults(arr);
    }
}
