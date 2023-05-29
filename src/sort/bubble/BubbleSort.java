package sort.bubble;


public class BubbleSort {

    private static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = n - 1; j >= i + 1; j--) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static <T extends Comparable<T>> void bubbleSortDESC(T[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = n - 1; j >= i + 1; j--) {
                if (arr[j - 1].compareTo(arr[j]) < 0) {
                    T temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /*THIS*/
    private static <T extends Comparable<T>> void bubbleSortOptimize(T[] arr) {
        boolean isSwapped;
        int i = arr.length - 1;
        while (i > 0) {
            isSwapped = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            } else {
                i--;
            }
        }
    }

    private static <T> void showElement(T[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n--------------------------");
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 1, 5, 0, 3, 4, 0, 9, 8, 7, 6, 5};
        System.out.println("Before sort");
        showElement(arr);

//        System.out.println("After sort ASC");
//        bubbleSort(arr);
//        showElement(arr);
//        System.out.println("After sort DESC");
//        bubbleSortDESC(arr);
//        showElement(arr);

        System.out.println("After bobble sort optimize");
        bubbleSortOptimize(arr);
        showElement(arr);
    }
}
