public class StringElementOccurance {

    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        String str = "Manan";
        int idx = 0;
        char element = 'a';
        stringOccurance(str, idx, element);
    }

    static void stringOccurance(String str, int idx, int element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentElement = str.charAt(idx);
        if (currentElement == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        stringOccurance(str, idx + 1, element);
    }

}
