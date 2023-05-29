package sort.selection;

public class SelectionSort {

    public static <T> void printResults(T[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n--------------------------------");
    }

    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        Integer[] arr1 = {2, 1, 5, 0, 3, 4, 0, 9, 8, 7, 6, 5};
        Double[] arr2 = {4.5, 15.1, 20.6, 9.75, 7.41, 6.87, 3.25, 74.8, 12.01};
        String[] arr3 = {"Mai", "Anh", "Khanh", "Nam", "Huong", "Quynh", "Bach"};
        System.out.println("Before sort");
        printResults(arr1);
        printResults(arr2);
        printResults(arr3);
        System.out.println("After sort");
        selectionSort(arr1);
        selectionSort(arr2);
        selectionSort(arr3);
        printResults(arr1);
        printResults(arr2);
        printResults(arr3);
    }
}
