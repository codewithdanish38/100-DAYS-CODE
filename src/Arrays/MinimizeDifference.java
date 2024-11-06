package Arrays;
import java.util.Arrays;
public class MinimizeDifference {
    public static int Difference(int arr[], int k) {
        int n = arr.length - 1;
        Arrays.sort(arr);
        int initialDiff = arr[n] - arr[0];  // Corrected to arr[n] - arr[0]
        int smallest = arr[0] + k;          // Adjusted the smallest calculation
        int largest = arr[n] - k;           // Adjusted the largest calculation

        for (int i = 0; i < n; i++) {
            int smallestVal = Math.min(smallest, arr[i + 1] - k);
            int largestVal = Math.max(largest, arr[i] + k);
            initialDiff = Math.min(initialDiff, largestVal - smallestVal);
        }

        return initialDiff;
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 8, 8, 4, 1};
        int k = 3;
        System.out.println(Difference(arr, k));
    }
}
