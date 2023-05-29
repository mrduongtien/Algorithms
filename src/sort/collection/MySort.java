package sort.collection;

import java.util.Arrays;
import java.util.Comparator;

public class MySort {

    private static <T> void showElements(T[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private static void showElements(int[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private static void showElements(double[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 0, 3, 4, 0, 9, 8, 7, 6, 5};
        double[] arr2 = {4.5, 15.5, 20.6, 9.75, 8.98, 7.41, 6.87, 3.25, 74.8, 12.01};
        String[] arr3 = {"Mai", "Anh", "Khanh", "Nam", "Huong", "Quynh", "Bach"};

        Object[] objects = {"Mai", 1, 2.56, "Hello", 5, 89};

        showElements(arr1);
        Arrays.sort(arr1);
        showElements(arr1);
        System.out.println("---------------------");
        showElements(arr2);
        Arrays.sort(arr2);
        showElements(arr2);
        System.out.println("---------------------");
        showElements(arr3);
        Arrays.sort(arr3, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        showElements(arr3);
        System.out.println("---------------------");
    }
}
