package sort.quicksort.ex;

import java.util.Scanner;

public class Ex1 {
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

    private static void display(int[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of test case: ");
        int testCase = scanner.nextInt();
        int i = 0;
        while (i < testCase) {
            System.out.print("Input size of array [" + (i + 1) + "]: ");
            int size = scanner.nextInt();
            int[] arr = createArray(scanner, size);
            System.out.println("--------------------- CURRENT DATA ---------------------");
            display(arr);
            System.out.println("--------------------- SORTED DATA ---------------------");
            quickSort(arr, 0, arr.length - 1);
            display(arr);
            i++;
        }
    }

    private static int[] createArray(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

}
