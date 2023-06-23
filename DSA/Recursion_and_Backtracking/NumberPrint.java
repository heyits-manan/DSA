
public class NumberPrint {
    public static void main(String[] args) {
        int num = 5;
        numberPrint_descending(num);
    }

    static void numberPrint_descending(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        numberPrint_descending(num - 1);

    }

}
