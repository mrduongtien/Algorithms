package sort.conting;

public class CountingSort {
    public static int[] countingSort(int[] arr) {
        int n = arr.length;
        int k = max(arr);
        int[] count = new int[k + 1];
        int[] output = new int[n];
        // đếm số lần xuất hiện của các phần tử trong mảng
        for (int i = 0; i < n; i++) {
            int j = arr[i];
            count[j]++;
        }
        // cộng dồn số lần xuất hiện từ đầu mảng
        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }
        // đưa các phần tử về đúng vị trí
        for (int i = n - 1; i >= 0; i--) {
            int j = arr[i];
            count[j]--;
            output[count[j]] = arr[i];
        }
        return output; // trả về kết quả
    }

    private static int max(int[] arr) {
        int maxValue = arr[0];
        for (int e : arr) {
            if (e > maxValue) {
                maxValue = e;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 4, 9, 2};
        System.out.println("Sau khi sắp xếp: ");
        arr = countingSort(arr);
        showElements(arr);
    }

    private static void showElements(int[] arr) {
        for (var e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
