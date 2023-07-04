public class LinearSearch {

    public static int search(int[] numArr, int target) {
        for (int i = 0; i < numArr.length; i++) {
            if (target == numArr[i]) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numArr = { 1, 2, 3, 4, 5 };
        int target = 3;
        System.out.println(search(numArr, target));
    }
}
