package sort.bubble.ex;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test case: ");
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            System.out.print("Enter size of list: ");
            int size = scanner.nextInt();
            int[] array = inputData(size);
            bubbleSort(array);
            printResults(array);
            i++;
        }
    }

    private static int[] inputData(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter elements arr [" + i + "]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }


    private static void bubbleSort(int[] arr) {
        boolean isSwapped;
        int i = arr.length - 1;
        while (i > 0) {
            isSwapped = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
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

    private static void printResults(int[] arr) {
        System.out.println("-------------- RESULT --------------");
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
