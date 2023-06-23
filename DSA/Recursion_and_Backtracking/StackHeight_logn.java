public class StackHeight_logn {
    public static void main(String[] args) {
        int base = 5, power = 3;
        System.out.println(stackHeight(base, power));
    }

    public static int stackHeight(int base, int power) {

        if (base == 0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }
        if (power % 2 == 0) {
            return stackHeight(base, power / 2) * stackHeight(base, power / 2);
        } else {
            return stackHeight(base, power / 2) * stackHeight(base, power / 2) * base;
        }

    }
}
