package sort.merge.ex;

import com.sun.source.tree.ClassTree;

import java.util.Scanner;

public class Ex3 {

    private static void sort(String[] arr, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            sort(arr, first, middle);
            sort(arr, middle + 1, last);
            merge(arr, first, middle, last);
        }
    }

    private static void merge(String[] arr, int first, int middle, int last) {
        int leftSize = middle - first + 1;
        int rightSize = last - middle;
        String[] leftArray = new String[leftSize];
        String[] rightArray = new String[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = arr[first + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = first;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i].compareTo(rightArray[j]) < 0) {
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

    private static void display(String[] array) {
        for (var element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input test case: ");
        int testCase = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        while (count < testCase) {
            System.out.print("Input data: ");
            String content = scanner.nextLine();
            String[] charOfContent = content.split("\\s+");
            displayResults(charOfContent);
            count++;
        }

    }

    private static void displayResults(String[] charOfContent) {
        System.out.println("---------------------");
        System.out.print("Original words: ");
        display(charOfContent);
        System.out.print("Sorted words: ");
        sort(charOfContent, 0, charOfContent.length - 1);
        display(charOfContent);
        System.out.println("---------------------");
    }
}
