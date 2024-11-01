package Arrays;

import java.util.Scanner;

public class Kth_max_min {

    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int Kth_Max(int arr[],int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            max=Integer.MIN_VALUE;
            int MaxIndex=-1;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                    MaxIndex=j;
                }
            }
            if(arr[MaxIndex]!=-1){
                arr[MaxIndex]=Integer.MIN_VALUE;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[]={1,4,5,10,11,76};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
         int result=Kth_Max(arr,k);
        System.out.println("The Kth largest element of array:"+result);

    }
}
