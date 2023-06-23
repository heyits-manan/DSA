package Recursion_and_Backtracking;

public class factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.print(facto(num));
    }

    static int facto(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * facto(num - 1);
        }
    }
}
