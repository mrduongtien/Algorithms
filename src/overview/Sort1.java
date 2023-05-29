package overview;

public class Sort1 {
    private static void printResults(int[] arr) {
        for (var element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int target = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }

    private static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int p = partition(arr, leftIndex, rightIndex);
            quickSort(arr, leftIndex, p - 1);
            quickSort(arr, p + 1, rightIndex);
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

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        System.out.println("-------------- CURRENT DATA --------------");
        printResults(arr);

        System.out.println("-------------- INSERTION SORT --------------");
        insertionSort(arr);
        printResults(arr);
        System.out.println("-------------- QUICK SORT --------------");
        quickSort(arr, 0, arr.length - 1);
        printResults(arr);

    }

}
