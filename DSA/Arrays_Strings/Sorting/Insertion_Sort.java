
package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 10, -1, 0, 100 };
        sort(arr);

    }

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = current;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
