package sort.selection.ex;

import java.util.Scanner;

public class Ex1 {

    public static void sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void printResult(int[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n-------------------------------");
    }

    private static int[] inputData(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter elements arr [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of test: ");
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            System.out.print("Input size of array: ");
            int size = scanner.nextInt();
            int[] array = inputData(size);
            sorting(array);
            printResult(array);
            i++;
        }
    }
}
