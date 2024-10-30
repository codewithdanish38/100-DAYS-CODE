package Arrays;

import java.util.Scanner;

public class Maximum_Minimum {

    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
     //Maximum Of Array
    public static int Maximum(int arr[],int mx){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    //Minimum Of array
    public  static int Minimum(int arr[],int mn){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mn){
                mn=arr[i];
            }
        }
        return mn;
    }

    public static void main(String[] args) {
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Element of Array");
          int arr[]={3,6,7,1,23};
        System.out.print("The Maximum Element in array"+" " +Maximum(arr,mx));
        System.out.println();
        System.out.print("The Minimum Element in array"+" " +Minimum(arr,mn));
    }
}
