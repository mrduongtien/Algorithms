package sort.insertion.ex;

import java.util.Scanner;

public class Ex2 {

    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String target = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(target) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
    }

    public static void printResults(String[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of test case: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int i = 0;
        while (i < n) {
            System.out.print("Input data: ");
            String data = scanner.nextLine();
            String[] words = data.split("\\s+");
            insertionSort(words);
            printResults(words);
            i++;
        }
    }
}
