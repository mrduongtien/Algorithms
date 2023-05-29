package sort.merge.ex;

import java.util.Scanner;

public class Ex1 {

    private static void sort(int[] arr, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            sort(arr, first, middle);
            sort(arr, middle + 1, last);
            merge(arr, first, middle, last);
        }
    }

    private static void merge(int[] arr, int first, int middle, int last) {
        int leftSize = middle - first + 1;
        int rightSize = last - middle;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = arr[first + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = first;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < leftSize) {
            arr[k++] = leftArray[i++];
        }
        while (j < rightSize) {
            arr[k++] = rightArray[j++];
        }
    }

    private static void display(int[] arr) {
        for (var element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of test case: ");
        int testCase = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < testCase) {
            System.out.print("Input size of array " + (i + 1) + ": ");
            int size = scanner.nextInt();
            int[] array = createArray(scanner, size);
            System.out.println("Original array " + (i + 1) + ": ");
            display(array);
            System.out.println("Sorted array " + (i + 1) + ": ");
            sort(array, 0, array.length - 1);
            display(array);
            i++;
        }
    }

    private static int[] createArray(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
