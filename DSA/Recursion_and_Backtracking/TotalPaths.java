public class TotalPaths {

    public static int paths(int i, int j, int m, int n) {

        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downPaths = paths(i + 1, j, m, n);
        int rightPaths = paths(i, j + 1, m, n);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {

    }
}