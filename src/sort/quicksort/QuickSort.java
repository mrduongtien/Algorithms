package sort.quicksort;

public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            var p = partition(arr, leftIndex, rightIndex);
            quickSort(arr, leftIndex, p - 1);
            quickSort(arr, p + 1, rightIndex);
        }

    }

    private static <T extends Comparable> int partition(T[] arr, int left, int right) {
        T pivot = arr[right];
        var i = left;
        for (int j = left; j <= right; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        T temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }

    private static <T> void showElement(T[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr1 = {2, 1, 5, 0, 3, 4, 0, 9, 8, 7, 6, 5};
        Double[] arr2 = {4.5, 15.5, 20.6, 9.5, 8.98, 7.41, 6.87, 3.25, 74.8, 12.01};
        String[] arr3 = {"Duong", "Dinh", "Anh"};

        System.out.println("------------------ CURRENT DATA ------------------");
        System.out.print("Integer: ");
        showElement(arr1);
        System.out.print("Double: ");
        showElement(arr2);
        System.out.print("String: ");
        showElement(arr3);

        System.out.println("-------------------- SORTED ASC -------------------");
        quickSort(arr1, 0, arr1.length - 1);
        quickSort(arr2, 0, arr2.length - 1);
        quickSort(arr3, 0, arr3.length - 1);
        showElement(arr1);
        showElement(arr2);
        showElement(arr3);
    }
}
