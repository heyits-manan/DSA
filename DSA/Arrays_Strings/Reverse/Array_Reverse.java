package Reverse;

//Reversing an array using iteration!

import java.util.Scanner;

public class Array_Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arrLen = sc.nextInt();
        int[] numArr = new int[arrLen];

        for (int i = 0; i < arrLen; i++) {
            numArr[i] = sc.nextInt();
        }

        arr_rev(numArr);
    }

    static void arr_rev(int[] arr) {
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
