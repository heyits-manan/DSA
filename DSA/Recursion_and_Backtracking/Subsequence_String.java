public class Subsequence_String {

    static void subsequence(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);

        subsequence(str, idx + 1, newStr + currentChar);

        subsequence(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");
    }

}
