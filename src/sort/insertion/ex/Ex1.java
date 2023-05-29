package sort.insertion.ex;

import java.util.Scanner;

public class Ex1 {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int target = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }

    public static void printResults(int[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of test case: ");
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            System.out.print("Input size of array: ");
            int size = scanner.nextInt();
            int[] array = inputData(size);
            insertionSort(array);
            printResults(array);
            i++;
        }
    }

    private static int[] inputData(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input element at [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
