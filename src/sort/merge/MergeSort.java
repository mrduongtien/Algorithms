package sort.merge;

public class MergeSort {

    public static void mergeSort(int[] array, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(array, first, middle);
            mergeSort(array, middle + 1, last);
            merge(array, first, middle, last);
        }
    }

    private static void merge(int[] array, int first, int middle, int last) {
        int leftSize = middle - first + 1;
        int rightSize = last - middle;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // copy
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[first + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // merge
        int i = 0, j = 0, k = first;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftSize) {
            array[k++] = leftArray[i++];
        }
        while (j < rightSize) {
            array[k++] = rightArray[j++];
        }
    }

    public static void printResult(int[] array) {
        for (var e: array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {100, 26, 30, 27, 11, 54, 3, 4, 0, 9, 8, 79, 6, 5};
        System.out.println("Trước khi sắp xếp: ");
        printResult(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sau khi sắp xếp: ");
        printResult(arr);
    }


}
