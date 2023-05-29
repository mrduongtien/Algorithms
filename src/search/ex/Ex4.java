package search.ex;

public class Ex4 {

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > target) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            quickSort(arr, p +1, right);
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

    private static void display(int[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    private static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, right, target);
            } else {
                return binarySearch(arr, left, mid - 1, target);
            }
        }
        return -1;
    }

    private static void search(int[] arr, int target) {
        int index = binarySearch(arr, 0, arr.length-1, target);
        if (index >= 0) {
            System.out.print("arr[" + index + "]: " + arr[index]);
        } else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 7, 6, 4, 1};

        display(arr);

//        insertionSort(arr);

        quickSort(arr, 0, arr.length - 1);
        display(arr);

        search(arr, 6);


    }
}
