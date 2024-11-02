package Arrays;

import java.util.Arrays;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6};
        int[] arr2 = {5, 5, 6, 7, 8};
        int[] result = unionOfSortedArrays(arr1, arr2);

        System.out.println("Union of Arrays: " + Arrays.toString(result));
    }

    public static int[] unionOfSortedArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[arr1.length + arr2.length];

        // Merge arrays and handle duplicates
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                temp[k++] = arr2[j++];
            } else {
                temp[k++] = arr1[i++];
                j++;  // Skip duplicate in arr2
            }
        }

        // Append remaining elements from arr1
        while (i < arr1.length) {
            temp[k++] = arr1[i++];
        }

        // Append remaining elements from arr2
        while (j < arr2.length) {
            temp[k++] = arr2[j++];
        }

        // Copy the result to a new array with the correct length
        return Arrays.copyOf(temp, k);
    }
}
