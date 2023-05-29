package sort.quicksort.ex;

import java.util.Scanner;

public class Ex3 {
    private static void quickSort(String[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int p = partition(arr, leftIndex, rightIndex);
            quickSort(arr, leftIndex, p - 1);
            quickSort(arr, p + 1, rightIndex);
        }
    }

    private static int partition(String[] arr, int left, int right) {
        String pivot = arr[right];
        int i = left;
        for (int j = left; j <= right; j++) {
            if (arr[j].compareTo(pivot) > 0) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        String temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }

    private static void display(String[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input test case: ");
        int testCase = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (i < testCase) {
            System.out.print("Input content [" + (i + 1) + "]: ");
            String content = scanner.nextLine();
            String[] arr = content.split("\\s+");
            System.out.println("------------------- CURRENT DATA -------------------");
            display(arr);
            System.out.println("------------------- SORTED DATA -------------------");
            quickSort(arr, 0, arr.length - 1);
            display(arr);
            i++;
        }
    }
}
