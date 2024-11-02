package Arrays;

import java.util.Scanner;

public class Kth_max_min {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int kthMax(int arr[], int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != -1) {
                arr[maxIndex] = Integer.MIN_VALUE;
            }
        }
        return max;
    }

    public static int kthMin(int arr[], int k) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != -1) {
                arr[minIndex] = Integer.MAX_VALUE;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 10, 11, 76};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        System.out.print("Original array: ");
        printArray(arr);

        int maxResult = kthMax(arr.clone(), k);  // Cloning array to keep it unchanged
        System.out.println("The " + k + "-th largest element of the array: " + maxResult);

        int minResult = kthMin(arr.clone(), k);  // Cloning array to keep it unchanged
        System.out.println("The " + k + "-th smallest element of the array: " + minResult);

        sc.close();
    }
}
