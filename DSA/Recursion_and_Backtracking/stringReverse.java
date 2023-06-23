public class stringReverse {
    public static void main(String[] args) {
        String str = "Manan";
        int idx = str.length() - 1;
        strRev(str, idx);
    }

    static void strRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.println(str.charAt(idx));
        strRev(str, idx - 1);
    }
}
