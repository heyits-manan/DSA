public class RemoveAllDuplicates {
    public static boolean[] map = new boolean[52]; // Increased size to handle uppercase letters

    public static void duplicateRemove(String str, String newStr, int idx) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            duplicateRemove(str, newStr, idx + 1);
        } else {
            newStr += currentChar;
            map[currentChar - 'a'] = true;
            duplicateRemove(str, newStr, idx);
        }
    }

    public static void main(String[] args) {
        String str = "aabaa";
        duplicateRemove(str, "", 0);
    }
}
