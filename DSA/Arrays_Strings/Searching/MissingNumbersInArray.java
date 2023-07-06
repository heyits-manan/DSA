public class MissingNumbersInArray {

    static int missingNumber(int array[], int n) {

        int sn = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int req_num = sn - sum;
        return req_num;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
        System.out.println(missingNumber(arr, n));
    }
}
