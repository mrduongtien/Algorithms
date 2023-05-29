package sort.insertion;

public class InsertionSort {

    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T target = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(target) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }

    public static <T> void printResults(T[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n-----------------------------------");
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
        insertionSort(arr1);
        insertionSort(arr2);
        insertionSort(arr3);
        printResults(arr1);
        printResults(arr2);
        printResults(arr3);
    }
}
