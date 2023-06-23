public class MoveXString {
    public static void main(String[] args) {
        String str = "xxxtentacionxxx";
        String newStr = "";
        moveX(str, 0, 0, newStr);
    }

    static void moveX(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            count++;
            moveX(str, idx + 1, count, newStr);
        } else {
            newStr += currentChar;
            moveX(str, idx + 1, count, newStr);
        }

    }
}
