package Arrays;

public class ReverseArray {
    //Reverse A Array
    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void ReverseArray(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,1};
          ReverseArray(arr);
          Printarray(arr);
    }
}
