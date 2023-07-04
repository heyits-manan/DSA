public class BinarySearch {

    public static int search(int[] numArr, int target) {
        int low = 0, high = numArr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == numArr[mid]) {
                return mid;
            } else if (target < numArr[mid]) {
                high = mid - 1;
            } else if (target > numArr[mid]) {
                low = mid + 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] numArr = { 1, 2, 3, 4, 5, 6 };
        int target = 3;
        System.out.println(search(numArr, target));
    }
}
