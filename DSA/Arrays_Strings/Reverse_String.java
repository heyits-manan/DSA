public class Reverse_String {
    public static void main(String args[]) {
        String result = reverse("I am Manan");
        System.out.println("The reversed array is: \n" + result);
    }

    static String reverse(String str) {

        char ch;
        String nstr = "";

        if (str.length() < 2) {
            return "something is wrong";
        }

        for (int i = 0; i <= str.length() - 1; i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }
}
