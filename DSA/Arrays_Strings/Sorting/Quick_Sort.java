public class Quick_Sort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot_index = partition(arr, low, high);

            quickSort(arr, low, pivot_index - 1);
            quickSort(arr, pivot_index + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 10, 11, -100, 0 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
