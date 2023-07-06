import java.util.ArrayList;

public class SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        int left = 0, right = 0;
        boolean isFound = false;
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = arr[0];

        if (s == 0) {
            ans.add(-1);
            return ans;
        }

        while (right < n) {
            if (sum == s) {
                isFound = true;
                break;
            } else if (sum < s) {
                right++;
                if (right < n) {
                    sum = sum + arr[right];
                }
            } else {
                sum = sum - arr[left];
                left++;
            }
        }
        if (isFound) {
            ans.add(left + 1);
            ans.add(right + 1);
            return ans;
        }

        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int n = arr.length;
        int s = 0;

        System.out.println(subarraySum(arr, n, s));
    }
}
