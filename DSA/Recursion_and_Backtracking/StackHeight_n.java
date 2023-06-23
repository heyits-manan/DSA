public class StackHeight_n {
    public static void main(String[] args) {
        int base = 5, power = 3;
        System.out.println(stackHeight(base, power));
    }

    static int stackHeight(int base, int power) {
        if (base == 0) {
            return 0;
        }
        if (power == 0) {
            return 1;
        }

        return base * stackHeight(base, power - 1);

    }
}