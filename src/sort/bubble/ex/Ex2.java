package sort.bubble.ex;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of test case: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < n) {
            System.out.print("Input data: ");
            String data = scanner.nextLine();
            String[] charOfText = data.split("\\s+");
            bubbleSort(charOfText);
            printResults(charOfText);
            i++;
        }
    }


    private static void bubbleSort(String[] arr) {
        boolean isSwapped;
        int i = arr.length - 1;
        while (i > 0) {
            isSwapped = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
            i--;
        }
    }

    private static void printResults(String[] arr) {
        System.out.println("-------------------- RESULT --------------------");
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
