package Reverse;

//Reversing a String using StringBuilder

public class StrReverse_StringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Manan Chataut");

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
