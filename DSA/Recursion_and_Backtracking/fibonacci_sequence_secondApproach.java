package Recursion_and_Backtracking;

public class fibonacci_sequence_secondApproach {
    public static void main(String[] args) {
        int initial = 0, last = 1;
        int terms = 7;
        System.out.println(initial);
        System.out.println(last);

        fibo(initial, last, terms - 2);
    }

    static void fibo(int initial, int last, int terms) {

        if (terms == 0) {
            return;
        }

        int sum = initial + last;
        System.out.println(sum);
        fibo(last, sum, terms - 1);
    }
}
