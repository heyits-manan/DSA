
//Checking if the array is sorted in                            [1,2,3,4,5] YES 
//strictly increasing order                                     [1,2,3,4,4] NO

public class CheckArrayOrder {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 3, 4, 5 };
        int idx = 0;
        boolean check = false;
        checkOrder(arr, idx, null);
    }

    static void checkOrder(int[] arr, int idx, Boolean check) {
        if (idx == arr.length - 1) {
            System.out.println(check);
            return;
        }
        if (arr[idx] < arr[idx + 1]) {
            check = true;
        } else if (arr[idx] >= arr[idx + 1]) {
            check = false;
            System.out.println(check);
            return;
        }
        checkOrder(arr, idx + 1, check);
    }
}
