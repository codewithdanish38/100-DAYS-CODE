package Arrays;

import java.util.Scanner;

public class Kth_Rotate_Array {
    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void RotateArray(int arr[] ,int k){
        int n= arr.length;
         k=k%n;
         int temp[]=new int[n];
         for(int i=0;i<k;i++){
             temp[i]=arr[n-k+i];
         }
         for(int i=k;i<n;i++){
             temp[i]=arr[i-k];
         }
         for(int i=0;i<n;i++){
             arr[i]=temp[i];
         }

    }




    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of k");
        int k= sc.nextInt();
         RotateArray(arr,k);
         Printarray(arr);

    }
}
