package sort.selection.ex;

import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of test case: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < size) {
            System.out.print("Input data: ");
            String content = scanner.nextLine();
            String[] charOfContent = content.split("\\s+");
            selectionSort(charOfContent);
            printResult(charOfContent);
            i++;
        }
    }

    private static void printResult(String[] charOfContent) {
        for (var e : charOfContent) {
            System.out.print(e + " ");
        }
        System.out.println("\n--------------------------");
    }

    private static void selectionSort(String[] charOfContent) {
        int n = charOfContent.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (charOfContent[j].compareTo(charOfContent[min]) < 0) {
                    min = j;
                }
            }
            String temp = charOfContent[i];
            charOfContent[i] = charOfContent[min];
            charOfContent[min] = temp;
        }
    }
}
