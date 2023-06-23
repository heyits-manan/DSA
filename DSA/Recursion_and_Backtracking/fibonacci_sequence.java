
public class fibonacci_sequence {
    public static void main(String[] args) {
        int term = 5;

        for (int i = 0; i < term; i++) {
            System.out.println(fibo(term, i));
        }
    }

    static int fibo(int term, int num) {
        if (num == 0 || num == 1) {
            return num;
        } else if (num == 2) {
            return 1;
        }
        return fibo(term, num - 1) + fibo(term, num - 2);
    }
}
