package search.ex;

import java.util.Scanner;

public class Ex1 {

    public static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int p = partition(arr, leftIndex, rightIndex);
            quickSort(arr, leftIndex, p - 1);
            quickSort(arr, p + 1, rightIndex);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int target = arr[right];
        int i = left;
        for (int j = left; j <= right; j++) {
            if (arr[j] < target) {
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

    public static boolean binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, right, target);
            } else {
                return binarySearch(arr, left, mid - 1, target);
            }
        }
        return false;
    }

    public static void search(int[] arr, int target) {
        boolean check = binarySearch(arr, 0, arr.length - 1, target);
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of test case: " );
        int testCase = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (i < testCase) {
            System.out.print("Input size of list [" + (i + 1) + "]: ");
            int size = Integer.parseInt(scanner.nextLine());
            System.out.print("Input target: ");
            int target = Integer.parseInt(scanner.nextLine());
            int[] arr = createArray(scanner, size);
            search(arr, target);
            i++;
        }
    }

    private static int[] createArray(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input element [" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }
}
