public class StringDuplicateRemove {
    public static boolean[] map = new boolean[52]; // Increased size to handle uppercase letters

    public static void duplicateRemove(String str, String newStr, int idx) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        int charIndex = Character.toLowerCase(currentChar) - 'a'; // Convert to lowercase before getting the index
        if (charIndex >= 0 && charIndex < map.length && map[charIndex]) {
            duplicateRemove(str, newStr, idx + 1);
        } else {
            newStr += currentChar;
            if (charIndex >= 0 && charIndex < map.length) {
                map[charIndex] = true;
            }
            duplicateRemove(str, newStr, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "Manaaan";
        duplicateRemove(str, "", 0);
    }
}
