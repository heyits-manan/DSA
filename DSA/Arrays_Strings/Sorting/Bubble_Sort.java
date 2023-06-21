package Sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] numArr = { 10, -1, 2, 0 };

        sort(numArr);
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }

    }

}
